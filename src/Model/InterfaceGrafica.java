package Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Enums.*;


public class InterfaceGrafica extends JFrame {
    private JPanel Cuida;
    private JLabel Enter;
    private JButton btn;
    private JCheckBox motoCheckBox;
    private JCheckBox carroCheckBox;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JCheckBox SELECIONEAQUICheckBox;
    private JButton ADICIONARButton;
    private JCheckBox CARROCheckBox1;
    private JCheckBox MOTOCheckBox;
    private JComboBox comboBox5;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;



    public InterfaceGrafica() {
        //comboBox4.setEnabled(false);
        //SELECIONEAQUICheckBox.setEnabled(false);

        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    comboBox1.setModel(new DefaultComboBoxModel<>(tipoMarcaEnums));

                } else {
                    DefaultComboBoxModel<tipoMarcaEnum> model = new DefaultComboBoxModel<>();
                    comboBox1.setModel(model);
                }


            }
        });

        motoCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (motoCheckBox.isSelected()){
                    comboBox5.setModel(new DefaultComboBoxModel<>(tipoMotoEnum));
                    carroCheckBox.setSelected(false);
                }
                else {
                    DefaultComboBoxModel<tipoPistaEnum> model = new DefaultComboBoxModel<>();
                    comboBox5.setModel(model);
                }
            }
        });
        carroCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (carroCheckBox.isSelected()){
                    comboBox5.setModel(new DefaultComboBoxModel<>(tipoCarroEnum));
                    motoCheckBox.setSelected(false);
                }
                else {
                    DefaultComboBoxModel<tipoPistaEnum> model = new DefaultComboBoxModel<>();
                    comboBox5.setModel(model);
                }
            }
        });
        SELECIONEAQUICheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(SELECIONEAQUICheckBox.isSelected()){
                    comboBox3.setModel(new DefaultComboBoxModel<>(tipoPistaEnum));

                }
                else{
                    DefaultComboBoxModel<tipoPistaEnum> model = new DefaultComboBoxModel<>();
                    comboBox3.setModel(model);

                }

            }

        });
        //Selecionar terreno e exibir
        comboBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Enums.tipoPistaEnum terreno = (Enums.tipoPistaEnum) comboBox3.getSelectedItem();

                System.out.println("Pista Da Corrida selecionada: " + terreno);
                CondicoesDaPista condicoesDaPista = new CondicoesDaPista();
                condicoesDaPista.condicoes();
            }
        });

        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        MOTOCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (MOTOCheckBox.isSelected()){
                    comboBox2.setModel(new DefaultComboBoxModel<>(tipoMotoEnum));
                    CARROCheckBox1.setSelected(false);
                }
                else {
                    DefaultComboBoxModel<tipoPistaEnum> model = new DefaultComboBoxModel<>();
                    comboBox2.setModel(model);
                }
            }
        });

        CARROCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CARROCheckBox1.isSelected()){
                    comboBox2.setModel(new DefaultComboBoxModel<>(tipoCarroEnum));
                    MOTOCheckBox.setSelected(false);
                }
                else {
                    DefaultComboBoxModel<tipoPistaEnum> model = new DefaultComboBoxModel<>();
                    comboBox2.setModel(model);
                }
            }
        });

        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2.isSelected()) {
                    comboBox4.setModel(new DefaultComboBoxModel<>(tipoMarcaEnums));

                } else {
                    DefaultComboBoxModel<tipoMarcaEnum> model = new DefaultComboBoxModel<>();
                    comboBox4.setModel(model);
                }
            }
        });


        ADICIONARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String modeloMoto1 = motoCheckBox.isSelected() ? comboBox5.getSelectedItem().toString() : "";
                String modeloCarro1 = carroCheckBox.isSelected() ? comboBox5.getSelectedItem().toString() : "";
                String modeloMoto2 = MOTOCheckBox.isSelected() ? comboBox2.getSelectedItem().toString() : "";
                String modeloCarro2 = CARROCheckBox1.isSelected() ? comboBox2.getSelectedItem().toString() : "";
                boolean motoVerificar = motoCheckBox.isSelected();
                boolean carroVerificar = carroCheckBox.isSelected();
                boolean moto2Verificar = MOTOCheckBox.isSelected();
                boolean carro2Verificar = CARROCheckBox1.isSelected();
                Enums.tipoPistaEnum terreno = (Enums.tipoPistaEnum) comboBox3.getSelectedItem();

                CondicoesDaPista condicoesDaPista = new CondicoesDaPista();
                condicoesDaPista.condicoes();




                status1();
                System.out.println();
                status2();


            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                iniciarAposFechamento();
            }
        });
    }
    Enums.tipoMotoEnum[] tipoMotoEnum = Enums.tipoMotoEnum.values();
    Enums.tipoCarroEnum[] tipoCarroEnum = Enums.tipoCarroEnum.values();
    Enums.tipoPistaEnum[] tipoPistaEnum = Enums.tipoPistaEnum.values();
    Enums.tipoMarcaEnum[] tipoMarcaEnums = Enums.tipoMarcaEnum.values();

    //getters
    public String getModeloMoto1(){
        return motoCheckBox.isSelected() ? comboBox5.getSelectedItem().toString() : "";
    }
    public String getModeloCarro1(){
        return carroCheckBox.isSelected() ? comboBox5.getSelectedItem().toString() : "";
    }
    public String getModeloMoto2(){
        return MOTOCheckBox.isSelected() ? comboBox2.getSelectedItem().toString() : "";
    }
    public String getModeloCarro2(){
        return CARROCheckBox1.isSelected() ? comboBox2.getSelectedItem().toString() : "";
    }
    public boolean getMotoVerificar(){
        return motoCheckBox.isSelected();
    }
    public boolean getCarroVerificar(){
        return carroCheckBox.isSelected();
    }
    public boolean getMoto2Verificar(){
        return MOTOCheckBox.isSelected();
    }
    public boolean getCarro2Verificar(){
        return CARROCheckBox1.isSelected();
    }
    public tipoPistaEnum getTerreno(){
        return (Enums.tipoPistaEnum) comboBox3.getSelectedItem();
    }
    public void status1(){
        System.out.println("----- Piloto 1 -----");
        System.out.println("Modelo do veículo: " + (getMotoVerificar() ? getModeloMoto1() : getModeloCarro1()));
        System.out.println("Tipo do veículo: " + (getMotoVerificar() ? "Moto" : "Carro"));
    }
    public void status2(){
        System.out.println("\n----- Piloto 2 -----");
        System.out.println("Modelo do veículo: " + (getMoto2Verificar() ? getModeloMoto2() : getModeloCarro2()));
        System.out.println("Tipo do veículo: " + (getMoto2Verificar() ? "Moto" : "Carro"));


    }
    private void iniciarAposFechamento() {
        Iniciando iniciando = new Iniciando();
        iniciando.inciar();

        Piloto piloto = new Piloto();
        piloto.preencherDadosPilotos();

        System.out.println();

        Veiculo veiculo = new Veiculo("", 0,"",0,0,0);
        veiculo.preencherDadosVeiculo();

        Finalizando finalizando = new Finalizando();
        finalizando.finalizar();
    }



    public static void main(String[] args) {
        InterfaceGrafica interfaceGrafica = new InterfaceGrafica();
        interfaceGrafica.setContentPane(interfaceGrafica.Cuida);
        interfaceGrafica.setTitle("Bora");
        interfaceGrafica.setSize(800,400);
        interfaceGrafica.setVisible(true);
        interfaceGrafica.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);













    }


}
