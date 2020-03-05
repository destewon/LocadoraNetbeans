/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foursys.locadora.controller;

import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Filme;
import br.com.foursys.locadora.model.Locacao;
import br.com.foursys.locadora.model.Vendedor;

import br.com.foursys.locadora.view.LocacaoView;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



/**
 * Controla a tela de Locação
 *
 * @author amendes
 */
public class LocacaoController {

    private LocacaoView viewLocacao;
    private Locacao locacao = new Locacao();
    //private Filme filme = new Filme();
    private List<Cliente> listaClientes;
    private List<Vendedor> listaVendedores;
    private List<Filme> listaFilmes;
    private Filme filme = new Filme();
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Filme> listaFilmeLocacao = new ArrayList<Filme>();

    private Double valorTotal = 0.0;
    private Double valorPago = 0.0;
    private Double Troco = 0.0;
    public static final String fileNome = "C:/teste/novo2.xls";
    private String formaPagamento;

    public LocacaoController(LocacaoView viewLocacao) {

        this.viewLocacao = viewLocacao;

    }

    public void carregarComboCliente() {

        ClienteController controller = new ClienteController();
        listaClientes = controller.buscarTodos();

        this.viewLocacao.getJcbCliente().removeAllItems();
        this.viewLocacao.getJcbCliente().addItem("-Selecione Cliente-");

        for (Cliente cliente : listaClientes) {
            this.viewLocacao.getJcbCliente().addItem(cliente.getNome());

        }

    }

    public void carregarComboVendedor() {

        VendedorController controller = new VendedorController();
        listaVendedores = controller.buscarTodosVendedores();

        this.viewLocacao.getJcbVendedor().removeAllItems();
        this.viewLocacao.getJcbVendedor().addItem("-Selecione Vendedor-");

        for (Vendedor vendedor : listaVendedores) {
            this.viewLocacao.getJcbVendedor().addItem(vendedor.getNome());

        }

    }

    public void carregarComboFilme() {

        FilmeController controller = new FilmeController();
        listaFilmes = controller.buscarTodos();

        this.viewLocacao.getJcbFilme().removeAllItems();
        this.viewLocacao.getJcbFilme().addItem("-Selecione Filme-");

        for (Filme filme : listaFilmes) {
            this.viewLocacao.getJcbFilme().addItem(filme.getNome());

        }

    }

    public void incluirFilme() {

        if (this.viewLocacao.getJcbFilme().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecionar um filme");
        } else {

            DefaultTableModel modelo = (DefaultTableModel) this.viewLocacao.getTabelaLocacao().getModel();
            filme = listaFilmes.get(this.viewLocacao.getJcbFilme().getSelectedIndex() - 1);
            modelo.addRow(new String[]{filme.getCodigo() + "", filme.getNome(), "R$" + filme.getValor(), (filme.isPromocao()) ? "SIM" : "NÃO", "R$ " + filme.getValorPromocional()});
            listaFilmeLocacao.add(filme);

        }
        if (!filme.isPromocao()) {
            valorTotal += filme.getValor();
        } else {
            valorTotal += filme.getValorPromocional();
        }
        DecimalFormat formatador = new DecimalFormat("#.###");
        this.viewLocacao.getJtfValorTotal().setText(formatador.format(valorTotal) );

    }

    public void excluirFilme() {
        //this.viewLocacao.getJcbFilme().setSelectedIndex(0);
        DefaultTableModel modelo = (DefaultTableModel) this.viewLocacao.getTabelaLocacao().getModel();
        if (this.viewLocacao.getTabelaLocacao().getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "É necessário selecionar um filme");
        } else {
            
            filme=listaFilmeLocacao.get(this.viewLocacao.getTabelaLocacao().getSelectedRow());
            if (!filme.isPromocao()) {
                valorTotal -= filme.getValor();
                //this.viewLocacao.getJtfValorTotal().setText(valorTotal + "");
            } else {
                valorTotal -= filme.getValorPromocional();
                //this.viewLocacao.getJtfValorTotal().setText(valorTotal + "");
            }
           DecimalFormat formatador = new DecimalFormat("#.###");
            this.viewLocacao.getJtfValorTotal().setText(formatador.format(valorTotal) );
            //filme = listaFilmes.get(this.viewLocacao.getJcbFilme().getSelectedIndex());
            listaFilmeLocacao.remove(this.viewLocacao.getTabelaLocacao().getSelectedRow());
            modelo.removeRow(this.viewLocacao.getTabelaLocacao().getSelectedRow());
            
            
            
        }

    }
    
    public void troco(KeyEvent evt){
        DecimalFormat formatador = new DecimalFormat("#.###");
       
       if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            this.viewLocacao.getJtfValorPago().setText(this.viewLocacao.getJtfTroco().getText().trim());
        }
        if (this.viewLocacao.getJtfTroco().getText().trim().equals("")&&evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            
        }else{
        try {
             if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
        } else {
           this.viewLocacao.getJtfTroco().setText(
        (formatador.format(Double.parseDouble(this.viewLocacao.getJtfValorPago().getText().trim().replace(",", "."))-valorTotal)));
             }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apenas numeros são permitidos");
            this.viewLocacao.getJtfTroco().setText("0");
            this.viewLocacao.getJtfValorPago().setText("");
            //this.viewLocacao.getJbtCancelar().grabFocus();
        }
        }
    }
    
    
    public boolean validarCampos(){
        
        
        if (this.viewLocacao.getTabelaLocacao().getRowCount()==0) {
            JOptionPane.showMessageDialog(null, "Informe o UM FILME, campo obrigatório.");
            return false;
        }
        
        if (this.viewLocacao.getJtfValorPago().getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o VALOR PAGO, campo obrigatório.");
            return false;
        }
         if (this.viewLocacao.getJcbCliente().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o CLIENTE, campo obrigatório.");
            return false;
        }
         
         if (this.viewLocacao.getJcbVendedor().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o VENDEDOR, campo obrigatório.");
            return false;
        }
         
         if (opcaoSelecionada().trim().equals("")||opcaoSelecionada().trim().equals(null)) {
            JOptionPane.showMessageDialog(null, "Informe o A FORMA DE PAGAMENTO, campo obrigatório.");
            return false;
        }
        
        if (Double.parseDouble(this.viewLocacao.getJtfTroco().getText().trim().replace(",", "."))<0.0) {
            JOptionPane.showMessageDialog(null, "VALOR PAGO INSUFICIENTE");
            return false;
        }
        return true;
    }
    
    public void aux(){
        //this.viewLocacao.getJbtCancelar().grabFocus();
        
    }
    
    public void acaoBotaoSalvar(){
        if (validarCampos()) {
            
        
       HSSFWorkbook workbook = new HSSFWorkbook();
		
        HSSFSheet sheetAlunos = workbook.createSheet("Filme");
        locacao.setCliente(listaClientes.get(this.viewLocacao.getJcbCliente().getSelectedIndex()-1));
        locacao.setVendedor(listaVendedores.get(this.viewLocacao.getJcbVendedor().getSelectedIndex()-1));
        locacao.setFilme(listaFilmeLocacao.get(this.viewLocacao.getJcbFilme().getSelectedIndex()-1));
        
        //List<Locacao> listaLocacao = new ArrayList<Locacao>();
        //listaLocacao.add(new locacao(locacao.getCliente(),locacao.getVendedor(),locacao.getListaFilmes(),locacao.getFilme(),locacao.getValorTotal(),locacao.getValorPago(),locacao.getFormaPagamento()));
        //listaLocacao.add(listaFilmeLocacao);  
        int rowNum = 0;
        Row row = sheetAlunos.createRow(0);
        //Row row = sheetAlunos.createRow(rowNum++);
                        Cell cellNome = row.createCell(0);
			cellNome.setCellValue("Nome:");
                        
                        Cell cellNome2 = row.createCell(1);
			cellNome2.setCellValue(locacao.getCliente().getNome());
                        
                        Cell cellCpf = row.createCell(2);
			cellCpf.setCellValue("CPF:");
                        
                        Cell cellCpf2 = row.createCell(3);
			cellCpf2.setCellValue(locacao.getCliente().getCpf());
                        row = sheetAlunos.createRow(1);
                        Cell cellNomeVendedor = row.createCell(0);
			cellNomeVendedor.setCellValue("Vendedor:");
                        
                        Cell cellNomeVendedor2 = row.createCell(1);
                        cellNomeVendedor2.setCellValue(locacao.getVendedor().getNome());
                        
                        Cell cellAreaVendedor = row.createCell(2);
			cellAreaVendedor.setCellValue("Area:");
                        
                        Cell cellAreaVendedor2 = row.createCell(3);
			cellAreaVendedor2.setCellValue(locacao.getVendedor().getAreaVenda());
                        row = sheetAlunos.createRow(2);
                        Cell cellFormaPagamento = row.createCell(0);
			cellFormaPagamento.setCellValue("Forma Pagamento:");
                        
                        Cell cellFormaPagamento2 = row.createCell(1);
			cellFormaPagamento2.setCellValue(opcaoSelecionada());
                        
                        row = sheetAlunos.createRow(4);
                        Cell cellCodigoFilme = row.createCell(0);
			cellCodigoFilme.setCellValue("Codigo");
                        
                        Cell cellNomeFilme = row.createCell(1);
			cellNomeFilme.setCellValue("Nome");
                        
                        Cell cellValorFilme = row.createCell(2);
			cellValorFilme.setCellValue("Valor");
                        
                        Cell cellPromocaoFilme = row.createCell(3);
			cellPromocaoFilme.setCellValue("Promoção");     
                        
                        Cell cellValorPromocaoFilme = row.createCell(4);
			cellValorPromocaoFilme.setCellValue("Valor Promoção");
                        rowNum = 5;
		for (Filme locacao : listaFilmeLocacao) {
			
			row = sheetAlunos.createRow(rowNum++);
			
			int cellNum = 0;
                        
                        Cell cellCodigoFilme2 = row.createCell(cellNum++);
			cellCodigoFilme2.setCellValue(locacao.getCodigo());
                        
                        Cell cellNomeFilme2 = row.createCell(cellNum++);
			cellNomeFilme2.setCellValue(locacao.getNome());
			
                        Cell cellValorFilme2 = row.createCell(cellNum++);
			cellValorFilme2.setCellValue(locacao.getValor());
                        
                        Cell cellPromocaoFilme2 = row.createCell(cellNum++);
			cellPromocaoFilme2.setCellValue((locacao.isPromocao())? "SIM" : "NÃO");
                        
                        
                        
                        Cell cellValorPromocaoFilme2 = row.createCell(cellNum++);
			cellValorPromocaoFilme2.setCellValue(locacao.getValorPromocional());
                        
			//Cell cellNome2 = row.createCell(cellNum++);
			//cellNome2.setCellValue(locacao.getCliente().getNome());
			
			
			
			
		}
		
		
		try {
			FileOutputStream out = new FileOutputStream(new File(LocacaoController.fileNome));
			
			workbook.write(out);
			
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro na criação do arquivo.");
			e.printStackTrace();
		}
		
		System.out.println("Arquivo criado com sucesso!!");
		limparCampos();
		} else {
            
        }
		
		
}	
        
    public String opcaoSelecionada() {
		String resposta = "";
		
		if(this.viewLocacao.getJrbCheque().isSelected()) {
			resposta+=this.viewLocacao.getJrbCheque().getText();
		}
		if(this.viewLocacao.getJrbCredito().isSelected()) {
			resposta+=this.viewLocacao.getJrbCredito().getText();
		}
		if(this.viewLocacao.getJrbDebito().isSelected()) {
			resposta+=this.viewLocacao.getJrbDebito().getText();
		}
		if(this.viewLocacao.getJrbDinheiro().isSelected()) {
			resposta+=this.viewLocacao.getJrbDinheiro().getText();
		}
		//troca a cor da fonte para vermelhor
		
		
		
		return resposta;
	}
    
    
    public void limparCampos(){
        this.viewLocacao.getJcbCliente().setSelectedIndex(0);
        this.viewLocacao.getJcbFilme().setSelectedIndex(0);
        this.viewLocacao.getJcbVendedor().setSelectedIndex(0);
        this.viewLocacao.getTabelaLocacao().removeAll();
        this.viewLocacao.getJtfTroco().setText(null);
        this.viewLocacao.getJtfValorPago().setText(null);
        this.viewLocacao.getJtfValorTotal().setText(null);
        this.viewLocacao.getButtonGroup1().clearSelection();
         DefaultTableModel modelo = (DefaultTableModel) this.viewLocacao.getTabelaLocacao().getModel();
        //this.viewLocacao.getTabelaLocacao().setR
                modelo.setRowCount(0);
    }
    
    public void cancelar(){
        limparCampos();
        
    }
    
}
