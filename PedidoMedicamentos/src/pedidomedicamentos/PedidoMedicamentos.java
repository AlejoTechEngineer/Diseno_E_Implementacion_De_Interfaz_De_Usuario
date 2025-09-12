package pedidomedicamentos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PedidoMedicamentos extends JFrame {

    private JTextField txtMedicamento;
    private JComboBox<String> comboTipos;
    private JTextField txtCantidad;
    private JRadioButton rbCofarma, rbEmpsephar, rbCemefar;
    private ButtonGroup grupoDistribuidores;
    private JCheckBox chkPrincipal;
    private JCheckBox chkSecundaria;

    public PedidoMedicamentos() {
        setTitle("Registro de Pedido de Medicamentos");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título
        JLabel lblTitulo = new JLabel("Formulario de Registro de Pedido", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(lblTitulo, gbc);
        gbc.gridwidth = 1;

        // Nombre medicamento
        JLabel lblMedicamento = new JLabel("Nombre del medicamento:");
        lblMedicamento.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(lblMedicamento, gbc);

        txtMedicamento = new JTextField(20);
        txtMedicamento.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        panel.add(txtMedicamento, gbc);

        // Tipo de medicamento
        JLabel lblTipo = new JLabel("Tipo de medicamento:");
        lblTipo.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lblTipo, gbc);

        String[] tipos = {"Seleccione tipo", "Analgesico", "Analeptico", "Anestesico", "Antiacido", "Antidepresivo", "Antibiotico"};
        comboTipos = new JComboBox<>(tipos);
        comboTipos.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        panel.add(comboTipos, gbc);

        // Cantidad
        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(lblCantidad, gbc);

        txtCantidad = new JTextField(20);
        txtCantidad.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        panel.add(txtCantidad, gbc);

        // Distribuidor
        JLabel lblDistribuidor = new JLabel("Distribuidor:");
        lblDistribuidor.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(lblDistribuidor, gbc);

        rbCofarma = new JRadioButton("Cofarma");
        rbEmpsephar = new JRadioButton("Empsephar");
        rbCemefar = new JRadioButton("Cemefar");
        rbCofarma.setFont(new Font("Arial", Font.PLAIN, 14));
        rbEmpsephar.setFont(new Font("Arial", Font.PLAIN, 14));
        rbCemefar.setFont(new Font("Arial", Font.PLAIN, 14));
        rbCofarma.setBackground(Color.WHITE);
        rbEmpsephar.setBackground(Color.WHITE);
        rbCemefar.setBackground(Color.WHITE);
        grupoDistribuidores = new ButtonGroup();
        grupoDistribuidores.add(rbCofarma);
        grupoDistribuidores.add(rbEmpsephar);
        grupoDistribuidores.add(rbCemefar);
        JPanel panelDistribuidor = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelDistribuidor.setBackground(Color.WHITE);
        panelDistribuidor.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        panelDistribuidor.add(rbCofarma);
        panelDistribuidor.add(rbEmpsephar);
        panelDistribuidor.add(rbCemefar);
        gbc.gridx = 1;
        panel.add(panelDistribuidor, gbc);

        // Sucursales
        JLabel lblSucursal = new JLabel("Sucursal:");
        lblSucursal.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(lblSucursal, gbc);

        JPanel panelSucursal = new JPanel(new GridLayout(2, 1));
        panelSucursal.setBackground(Color.WHITE);
        chkPrincipal = new JCheckBox("Principal - Calle de la Rosa n. 28");
        chkSecundaria = new JCheckBox("Secundaria - Calle Alcazabilla n. 3");
        chkPrincipal.setFont(new Font("Arial", Font.PLAIN, 14));
        chkSecundaria.setFont(new Font("Arial", Font.PLAIN, 14));
        chkPrincipal.setBackground(Color.WHITE);
        chkSecundaria.setBackground(Color.WHITE);
        panelSucursal.add(chkPrincipal);
        panelSucursal.add(chkSecundaria);
        gbc.gridx = 1;
        panel.add(panelSucursal, gbc);

        // Botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.setBackground(Color.WHITE);
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setPreferredSize(new Dimension(120, 30));
        btnConfirmar.setBackground(new Color(76, 175, 80)); // Verde (#4CAF50)
        btnConfirmar.setForeground(Color.WHITE);
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setPreferredSize(new Dimension(120, 30));
        btnLimpiar.setBackground(new Color(244, 67, 54)); // Rojo (#F44336)
        btnLimpiar.setForeground(Color.WHITE);
        panelBotones.add(btnConfirmar);
        panelBotones.add(btnLimpiar);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(panelBotones, gbc);

        add(panel);

        // Acción de confirmar
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Validar nombre del medicamento
                    String medicamento = txtMedicamento.getText().trim();
                    if (medicamento.isEmpty() || !medicamento.matches("[a-zA-Z0-9 ]+")) {
                        throw new IllegalArgumentException("El nombre del medicamento debe ser alfanumérico y no vacío.");
                    }

                    // Validar tipo
                    String tipo = (String) comboTipos.getSelectedItem();
                    if (tipo == null || tipo.equals("Seleccione tipo")) {
                        throw new IllegalArgumentException("Debe seleccionar un tipo de medicamento válido.");
                    }

                    // Validar cantidad
                    int cantidad;
                    try {
                        cantidad = Integer.parseInt(txtCantidad.getText().trim());
                        if (cantidad <= 0) {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException ex) {
                        throw new IllegalArgumentException("La cantidad debe ser un número entero positivo.");
                    }

                    // Validar distribuidor
                    String distribuidor = null;
                    if (rbCofarma.isSelected()) distribuidor = "Cofarma";
                    else if (rbEmpsephar.isSelected()) distribuidor = "Empsephar";
                    else if (rbCemefar.isSelected()) distribuidor = "Cemefar";
                    if (distribuidor == null) {
                        throw new IllegalArgumentException("Por favor, seleccione un distribuidor (Cofarma, Empsephar o Cemefar).");
                    }

                    // Validar sucursal
                    if (!chkPrincipal.isSelected() && !chkSecundaria.isSelected()) {
                        throw new IllegalArgumentException("Debe seleccionar al menos una sucursal.");
                    }

                    // Direcciones
                    StringBuilder direcciones = new StringBuilder();
                    if (chkPrincipal.isSelected()) {
                        direcciones.append("Calle de la Rosa n. 28");
                    }
                    if (chkSecundaria.isSelected()) {
                        if (direcciones.length() > 0) direcciones.append(" y ");
                        direcciones.append("Calle Alcazabilla n. 3");
                    }

                    // Variables finales para lambda
                    final int cantidadFinal = cantidad;
                    final String tipoFinal = tipo;
                    final String medicamentoFinal = medicamento;
                    final String distribuidorFinal = distribuidor;
                    final String direccionesFinal = direcciones.toString();

                    // Ventana de resumen (JFrame)
                    JFrame resumen = new JFrame("Pedido al distribuidor " + distribuidorFinal);
                    resumen.setSize(400, 200);
                    resumen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    resumen.setLocationRelativeTo(PedidoMedicamentos.this);
                    resumen.setLayout(new BorderLayout(10, 10));

                    JPanel resumenPanel = new JPanel(new GridBagLayout());
                    resumenPanel.setBackground(Color.WHITE);
                    GridBagConstraints gbcResumen = new GridBagConstraints();
                    gbcResumen.insets = new Insets(10, 10, 10, 10);
                    gbcResumen.anchor = GridBagConstraints.CENTER;

                    JLabel lblResumen = new JLabel(cantidadFinal + " unidades del " + tipoFinal.toLowerCase() + " " + medicamentoFinal);
                    lblResumen.setFont(new Font("Arial", Font.PLAIN, 14));
                    gbcResumen.gridx = 0;
                    gbcResumen.gridy = 0;
                    resumenPanel.add(lblResumen, gbcResumen);

                    JLabel lblDireccion = new JLabel("<html>Para la farmacia situada en:<br>" + direccionesFinal + "</html>");
                    lblDireccion.setFont(new Font("Arial", Font.PLAIN, 14));
                    gbcResumen.gridy = 1;
                    resumenPanel.add(lblDireccion, gbcResumen);

                    resumen.add(resumenPanel, BorderLayout.CENTER);

                    JPanel pBtns = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
                    pBtns.setBackground(Color.WHITE);
                    JButton btnEnviarResumen = new JButton("Enviar Pedido");
                    btnEnviarResumen.setPreferredSize(new Dimension(120, 30));
                    btnEnviarResumen.setBackground(new Color(76, 175, 80)); // Verde (#4CAF50)
                    btnEnviarResumen.setForeground(Color.WHITE);
                    JButton btnCancelar = new JButton("Cancelar");
                    btnCancelar.setPreferredSize(new Dimension(120, 30));
                    btnCancelar.setBackground(new Color(244, 67, 54)); // Rojo (#F44336)
                    btnCancelar.setForeground(Color.WHITE);
                    pBtns.add(btnEnviarResumen);
                    pBtns.add(btnCancelar);
                    resumen.add(pBtns, BorderLayout.SOUTH);

                    // Acciones de botones del resumen
                    btnEnviarResumen.addActionListener(ev -> {
                        System.out.println("Pedido enviado: " + cantidadFinal + " unidades del " + tipoFinal.toLowerCase() + " " + medicamentoFinal + " para " + distribuidorFinal + " en " + direccionesFinal);
                        JOptionPane.showMessageDialog(resumen, "Pedido enviado correctamente al distribuidor " + distribuidorFinal, "Envío Exitoso", JOptionPane.INFORMATION_MESSAGE);
                        resumen.dispose();
                    });
                    btnCancelar.addActionListener(ev -> resumen.dispose());

                    resumen.setVisible(true);

                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(PedidoMedicamentos.this, ex.getMessage(), "Error en el Formulario", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Acción de limpiar
        btnLimpiar.addActionListener(e -> {
            txtMedicamento.setText("");
            comboTipos.setSelectedIndex(0);
            txtCantidad.setText("");
            grupoDistribuidores.clearSelection();
            chkPrincipal.setSelected(false);
            chkSecundaria.setSelected(false);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PedidoMedicamentos().setVisible(true);
        });
    }
}
