package Inventario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Inventario extends JFrame {
    private JTextField idTextField, descripcionTextField, cantidadTextField;
    private JTextArea resultArea;
    private LinkedList<Producto> inventario;

    public Inventario() {
        inventario = new LinkedList<>();

      
        setTitle("Inventario App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        JLabel idLabel = new JLabel("ID:");
        idTextField = new JTextField(10);

        JLabel descripcionLabel = new JLabel("Descripción:");
        descripcionTextField = new JTextField(10);

        JLabel cantidadLabel = new JLabel("Cantidad:");
        cantidadTextField = new JTextField(10);

        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProducto();
            }
        });

        JButton mostrarButton = new JButton("Mostrar");
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInventario();
            }
        });

        JButton borrarButton = new JButton("Borrar");
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarProducto();
            }
        });

        resultArea = new JTextArea(10, 30);

        
        add(idLabel);
        add(idTextField);
        add(descripcionLabel);
        add(descripcionTextField);
        add(cantidadLabel);
        add(cantidadTextField);
        add(agregarButton);
        add(mostrarButton);
        add(borrarButton);
        add(resultArea);

       
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarProducto() {
        try {
            int id = Integer.parseInt(idTextField.getText());
            String descripcion = descripcionTextField.getText();
            int cantidad = Integer.parseInt(cantidadTextField.getText());

            
            boolean encontrado = false;
            for (Producto producto : inventario) {
                if (producto.getId() == id) {
                    
                    producto.setCantidad(producto.getCantidad() + cantidad);
                    JOptionPane.showMessageDialog(this, "Cantidad actualizada correctamente.");
                    encontrado = true;
                    break;
                }
            }

            
            if (!encontrado) {
                Producto nuevoProducto = new Producto(id, descripcion, cantidad);
                inventario.add(nuevoProducto);
                JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");
            }

            
            idTextField.setText("");
            descripcionTextField.setText("");
            cantidadTextField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos para ID y Cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarInventario() {
        resultArea.setText("Inventario:\n");
        for (Producto producto : inventario) {
            resultArea.append(producto.toString() + "\n");
        }
    }

    private void borrarProducto() {
        try {
            int id = Integer.parseInt(idTextField.getText());

            
            boolean encontrado = false;
            for (Producto producto : inventario) {
                if (producto.getId() == id) {
                    inventario.remove(producto);
                    JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Producto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }

           
            idTextField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor válido para ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inventario();
            }
        });
    }
}

class Producto {
    private int id;
    private String descripcion;
    private int cantidad;

    public Producto(int id, String descripcion, int cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descripción: " + descripcion + ", Cantidad: " + cantidad;
    }
}
