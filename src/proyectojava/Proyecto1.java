package proyectojava;

import iug.Menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Proyecto1 {
    
    public static void main(String[] args) {
        leerData();
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
    public static void GuardarDatos() {
        try {
            String alimento = "Alimento.txt";
            File file = new File(alimento);
            
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream escritor = new ObjectOutputStream(fo);
            escritor.writeObject(Lista.procesados);
            escritor.writeObject(Lista.naturales);
            escritor.close();
        } catch (Exception e) {
            
        }
    }
    
    public static void leerData() {
        try {
            String nombre = "AlimentoNatural.txt";
            File file = new File(nombre);
            
            FileInputStream fo = new FileInputStream(file);
            ObjectInputStream lector = new ObjectInputStream(fo);
            Lista.naturales = (ArrayList<AlimentoNatural>) lector.readObject();
            //proyectojava.Lista.procesados = (ArrayList<AlimentoProcesado>) lector.readObject();
            //proyectojava.Lista.naturales = (ArrayList<AlimentoNatural>) lector.readObject();
            lector.close();
        } catch (Exception e) {
            
        }
    }
    
    public static void archivoEliminado(String alimento) {
        
        try {
            File archivo = new File("eliminados.txt");
            FileWriter eliminados = new FileWriter(archivo, true);
            eliminados.write(alimento);
            eliminados.write(System.lineSeparator());
            eliminados.close();
            
        } catch (Exception e) {
            
        }
    }
    
}
