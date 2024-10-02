package Archivo;

import entes.criaturas.player;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class archivo {

    public int personaje;
    public int dinero;
    public String nombre;
    public double vida;
    public double vigor;
    public boolean[] personajes = new boolean[9];
    public boolean[] armas = new boolean[12];
    public int[] porteArmas = new int[3];
    private player player;

    public archivo(player player) {
        this.player = player;
    }

    public void ElegirJugador(int per, String apo) {
        String sDir = "C:\\user";
        File f = new File(sDir);
        String ruta = "C:\\user"; //Carpeta ruta
        String fileName = "Personaje1.txt"; //Nombre archivo
        String fileName2 = "Personaje2.txt"; //Nombre archivo
        String fileName3 = "Personaje3.txt"; //Nombre archivo
        File file = new File(ruta, fileName);
        File file2 = new File(ruta, fileName2);
        File file3 = new File(ruta, fileName3);
        int vid = 10000;
        int vig = 1000;
        int dine = 10000;
        player.dinero = dine;
        String arm = "1,0,0";
        String p = "0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0";
        switch (per) {
            case 1:
                p = "1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0";
                arm = "1,0,0";
                break;
            case 2:
                p = "0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0";
                arm = "8,0,0";
                break;
            case 3:
                p = "0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0";
                arm = "6,0,0";
                break;
            default:

                break;
        }

        if (!file.exists()) { //No existe el archivo
            f.mkdir();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error archivo 1");
            }

            try (Scanner sc = new Scanner(file)) {

                try (FileWriter fw = new FileWriter(file.getAbsoluteFile(), true)) {
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(per + "," + arm + "," + apo + "," + vid + "," + vig + "," + dine + "," + p);
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    fw.close();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "OcurriÃ³ un error al crear partida");
                }

            } catch (Exception e) {

            }
            player.partidaCargada = 1;
        } else if (!file2.exists()) {
            f.mkdir();
            try {
                file2.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error archivo 2");
            }
            try (Scanner sc2 = new Scanner(file2)) {

                try (FileWriter fw2 = new FileWriter(file2.getAbsoluteFile(), true)) {
                    BufferedWriter bw2 = new BufferedWriter(fw2);
                    bw2.write(per + "," + arm + "," + apo + "," + vid + "," + vig + "," + dine + "," + p);
                    bw2.newLine();
                    bw2.flush();
                    bw2.close();
                    fw2.close();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "OcurriÃ³ un error al crear partida");
                }

            } catch (Exception e) {

            }
            player.partidaCargada = 2;
        } else if (!file3.exists()) {
            f.mkdir();
            try {
                file3.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error archivo 3");
            }
            try (Scanner sc3 = new Scanner(file3)) {
                try (FileWriter fw = new FileWriter(file3.getAbsoluteFile(), true)) {
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(per + "," + arm + "," + apo + "," + vid + "," + vig + "," + dine + "," + p);
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    fw.close();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "OcurriÃ³ un error al crear partida");
                }

            } catch (Exception e) {

            }
            player.partidaCargada = 3;

        } else {
            JOptionPane.showMessageDialog(null, "AcciÃ³n no habilitada");
        }
        
    }

    public void EliminarPersonaje1() {
        String sDir = "C:\\user";
        File f = new File(sDir);
        String ruta = "C:\\user"; //Carpeta ruta
        String fileName = "Personaje1.txt"; //Nombre archivo
        String fileName2 = "Personaje2.txt"; //Nombre archivo
        String fileName3 = "Personaje3.txt"; //Nombre archivo
        File file = new File(ruta, fileName);
        File file2 = new File(ruta, fileName2);
        File file3 = new File(ruta, fileName3);

        try {

            File archivo = new File("C:\\user\\Personaje1.txt");
            File f1 = new File("C:\\user\\Personaje1.txt");
            File f2 = new File("C:\\user\\Personaje2.txt");
            File f3 = new File("C:\\user\\Personaje3.txt");
            boolean estatus = archivo.delete();
            if (file3.exists()) {
                f2.renameTo(f1);
                f3.renameTo(f2);
            } else if (file2.exists()) {
                f2.renameTo(f1);
            }
            if (!estatus) {

                //System.out.println("Error no se ha podido eliminar el  1");
            } else {

                System.out.println("Se ha eliminado el archivo exitosamente");

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    public void EliminarPersonaje2() {
        String sDir = "C:\\user";
        File f = new File(sDir);
        String ruta = "C:\\user"; //Carpeta ruta
        String fileName = "Personaje1.txt"; //Nombre archivo
        String fileName2 = "Personaje2.txt"; //Nombre archivo
        String fileName3 = "Personaje3.txt"; //Nombre archivo
        File file = new File(ruta, fileName);
        File file2 = new File(ruta, fileName2);
        File file3 = new File(ruta, fileName3);

        try {

            File archivo = new File("C:\\user\\Personaje2.txt");
            File f1 = new File("C:\\user\\Personaje1.txt");
            File f2 = new File("C:\\user\\Personaje2.txt");
            File f3 = new File("C:\\user\\Personaje3.txt");
            boolean estatus = archivo.delete();
            if (file3.exists()) {
                f3.renameTo(f2);
            }
            if (!estatus) {

                //System.out.println("Error no se ha podido eliminar el  2");
            } else {

                System.out.println("Se ha eliminado el archivo exitosamente");

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    public void EliminarPersonaje3() {
        try {

            File archivo = new File("C:\\user\\Personaje3.txt");

            boolean estatus = archivo.delete();

            if (!estatus) {

                //System.out.println("Error no se ha podido eliminar el  3");
            } else {

                System.out.println("Se ha eliminado el archivo exitosamente");

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    public void cargarPersonaje(int tipo) {
        String sDir = "C:\\user";
        File f = new File(sDir);
        String ruta = "C:\\user"; //Carpeta ruta
        String fileName = "Personaje1.txt"; //Nombre archivo
        String fileName2 = "Personaje2.txt";
        String fileName3 = "Personaje3.txt";
        File file = new File(ruta, fileName);
        File file2 = new File(ruta, fileName2);
        File file3 = new File(ruta, fileName3);

        switch (tipo) {
            case 1:
                if (!file.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
                try (Scanner sc = new Scanner(file)) {

                    while (sc.hasNextLine()) {
                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String person = data[0];
                        String nombr = data[4];
                        String vid = data[5];
                        String vig = data[6];
                        String din = data[7];
                        personaje = Integer.parseInt(person);
                        this.nombre = nombr;
                        this.vida = Double.valueOf(vid);
                        this.vigor = Double.valueOf(vig);
                        this.dinero = Integer.parseInt(din);

                        int u = 0;
                        for (int i = 1; i < 4; i++) {
                            porteArmas[u] = Integer.parseInt(data[i]);
                            u++;
                        }

                        u = 0;
                        for (int j = 17; j < 29; j++) {
                            if (data[j].equals("0")) {
                                armas[u] = false;
                            } else {
                                armas[u] = true;
                            }
                            u++;

                        }
                        u = 0;
                        for (int m = 8; m < 17; m++) {
                            if (data[m].equals("0")) {

                                personajes[u] = false;
                            } else {

                                personajes[u] = true;
                            }
                            u++;
                        }

                    }
                } catch (Exception e) {

                }
                break;
            case 2:
                if (!file2.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        file2.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
                try (Scanner sc = new Scanner(file2)) {
                    while (sc.hasNextLine()) {

                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String person = data[0];
                        String nombr = data[4];
                        String vid = data[5];
                        String vig = data[6];
                        String din = data[7];
                        personaje = Integer.parseInt(person);
                        this.nombre = nombr;
                        this.vida = Double.valueOf(vid);
                        this.vigor = Double.valueOf(vig);
                        this.dinero = Integer.parseInt(din);
                        int u = 0;
                        for (int i = 8; i < 17; i++) {
                            if (data[i].equals("0")) {
                                personajes[u] = false;
                            } else {
                                personajes[u] = true;
                            }
                            u++;
                        }
                        u = 0;
                        for (int i = 17; i < 29; i++) {
                            if (data[i].equals("0")) {
                                armas[u] = false;
                            } else {
                                armas[u] = true;
                            }
                            u++;
                        }
                        u = 0;
                        for (int i = 1; i < 4; i++) {
                            porteArmas[u] = Integer.parseInt(data[i]);
                            u++;
                        }

                    }
                } catch (Exception e) {

                }
                break;
            case 3:
                if (!file3.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        file3.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
                try (Scanner sc = new Scanner(file3)) {
                    while (sc.hasNextLine()) {

                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String person = data[0];
                        String nombr = data[4];
                        String vid = data[5];
                        String vig = data[6];
                        String din = data[7];
                        personaje = Integer.parseInt(person);
                        this.nombre = nombr;
                        this.vida = Double.valueOf(vid);
                        this.vigor = Double.valueOf(vig);
                        this.dinero = Integer.parseInt(din);
                        int u = 0;
                        for (int i = 8; i < 17; i++) {
                            if (data[i].equals("0")) {
                                personajes[u] = false;
                            } else {
                                personajes[u] = true;
                            }
                            u++;
                        }
                        u = 0;
                        for (int i = 17; i < 29; i++) {
                            if (data[i].equals("0")) {
                                armas[u] = false;
                            } else {
                                armas[u] = true;
                            }
                            u++;
                        }
                        u = 0;
                        for (int i = 1; i < 4; i++) {
                            porteArmas[u] = Integer.parseInt(data[i]);
                            u++;
                        }

                    }
                } catch (Exception e) {

                }
                break;
        }

        //System.out.println("" + p + "," + n + "," + v + "," + vg + "," + d);
    }

    public void cargarPersonajeJuego(int tipo) {
        String sDir = "C:\\user";
        File f = new File(sDir);
        String ruta = "C:\\user"; //Carpeta ruta
        String fileName = "Personaje1.txt"; //Nombre archivo
        String fileName2 = "Personaje2.txt";
        String fileName3 = "Personaje3.txt";
        File file = new File(ruta, fileName);
        File file2 = new File(ruta, fileName2);
        File file3 = new File(ruta, fileName3);

        switch (tipo) {
            case 1:
                if (!file.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }

                try (Scanner sc = new Scanner(file)) {

                    while (sc.hasNextLine()) {

                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String person = data[0];
                        String nombr = data[4];

                        String vid = data[5];
                        String vig = data[6];
                        String din = data[7];

                        player.trajeActual = Integer.parseInt(person);

                        player.nombre = nombr;
                     
                        player.vida = Integer.parseInt(vid);
                        
                        player.vigor = Integer.parseInt(vig);
                        player.dinero = Integer.parseInt(din);

                        int u = 0;
                        for (int i = 1; i < 4; i++) {
                            player.porteArmas[u] = Integer.parseInt(data[i]);
                            u++;
                        }

                        u = 0;
                        for (int j = 17; j < 29; j++) {
                            if (data[j].equals("0")) {
                                player.armas[u] = false;
                            } else {
                                player.armas[u] = true;
                            }
                            u++;

                        }
                        u = 0;

                        for (int m = 8; m < 17; m++) {
                            if (data[m].equals("0")) {

                                player.trajes[u] = false;
                            } else {

                                player.trajes[u] = true;
                            }
                            u++;
                        }
                        player.armaActual = player.porteArmas[0];
                        player.espacioArma = 1;

                        player.partidaCargada = 1;
                    }
                } catch (Exception e) {

                }

                break;
            case 2:
                if (!file2.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        file2.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
                try (Scanner sc = new Scanner(file2)) {
                    while (sc.hasNextLine()) {

                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String person = data[0];
                        String nombr = data[4];
                        String vid = data[5];
                        String vig = data[6];
                        String din = data[7];
                        player.trajeActual = Integer.parseInt(person);
                        player.nombre = nombr;
                        player.vida = Integer.parseInt(vid);
                        player.vigor = Integer.parseInt(vig);
                        player.dinero = Integer.parseInt(din);

                        int u = 0;
                        for (int i = 1; i < 4; i++) {
                            player.porteArmas[u] = Integer.parseInt(data[i]);
                            u++;
                        }

                        u = 0;
                        for (int j = 17; j < 29; j++) {
                            if (data[j].equals("0")) {
                                player.armas[u] = false;
                            } else {
                                player.armas[u] = true;
                            }
                            u++;

                        }
                        u = 0;
                        for (int m = 8; m < 17; m++) {
                            if (data[m].equals("0")) {

                                player.trajes[u] = false;
                            } else {

                                player.trajes[u] = true;
                            }
                            u++;
                        }
                        player.armaActual = player.porteArmas[0];
                        player.espacioArma = 1;
                        player.partidaCargada = 2;
                    }
                } catch (Exception e) {

                }
                break;
            case 3:
                if (!file3.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        file3.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
                try (Scanner sc = new Scanner(file3)) {
                    while (sc.hasNextLine()) {

                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String person = data[0];
                        String nombr = data[4];
                        String vid = data[5];
                        String vig = data[6];
                        String din = data[7];
                        player.trajeActual = Integer.parseInt(person);
                        player.nombre = nombr;
                        player.vida = Integer.parseInt(vid);
                        player.vigor = Integer.parseInt(vig);
                        player.dinero = Integer.parseInt(din);

                        int u = 0;
                        for (int i = 1; i < 4; i++) {
                            player.porteArmas[u] = Integer.parseInt(data[i]);
                            u++;
                        }

                        u = 0;
                        for (int j = 17; j < 29; j++) {
                            if (data[j].equals("0")) {
                                player.armas[u] = false;
                            } else {
                                player.armas[u] = true;
                            }
                            u++;

                        }
                        u = 0;
                        for (int m = 8; m < 17; m++) {
                            if (data[m].equals("0")) {

                                player.trajes[u] = false;
                            } else {

                                player.trajes[u] = true;
                            }
                            u++;
                        }
                        player.armaActual = player.porteArmas[0];
                        player.espacioArma = 1;
                        player.partidaCargada = 3;
                    }
                } catch (Exception e) {

                }
                break;
        }

        //System.out.println("" + p + "," + n + "," + v + "," + vg + "," + d);
    }

    public void ActualizarDatos2() {
        String sDir = "C:\\user";
        File f = new File(sDir);
        String ruta = "C:\\user"; //Carpeta ruta
        String fileName = "Personaje1.txt"; //Nombre archivo
        String fileName2 = "Personaje2.txt"; //Nombre archivo
        String fileName3 = "Personaje3.txt"; //Nombre archivo
        File file = new File(ruta, fileName);
        File file2 = new File(ruta, fileName2);
        File file3 = new File(ruta, fileName3);
        switch (player.partidaCargada) {
            case 1:

                try {

                    File archivo = new File("C:\\user\\Personaje1.txt");

                    boolean estatus = archivo.delete();

                    if (!estatus) {

                        //System.out.println("Error no se ha podido eliminar el  3");
                    } else {

                        System.out.println("Se ha eliminado el archivo 1 exitosamente");

                    }

                } catch (Exception e) {

                    System.out.println(e);

                }
                f.mkdir();
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Error archivo 1");
                }

                try (Scanner sc = new Scanner(file)) {

                    try (FileWriter fw = new FileWriter(file.getAbsoluteFile(), true)) {
                        String loquesea = "";
                        for (int i = 0; i < 9; i++) {
                            if (player.trajes[i] == true) {
                                loquesea = loquesea + ",1";
                            } else {
                                loquesea = loquesea + ",0";
                            }
                        }
                        for (int j = 0; j < 12; j++) {
                            if (player.armas[j] == true) {
                                loquesea = loquesea + ",1";
                            } else {
                                loquesea = loquesea + ",0";
                            }
                        }
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(player.trajeActual + "," + player.porteArmas[0] + "," + player.porteArmas[1] + "," + player.porteArmas[2] + "," + player.nombre + ","
                                + player.vida + "," + player.vigor + "," + player.dinero + loquesea);
                        bw.newLine();
                        bw.flush();
                        bw.close();
                        fw.close();

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "OcurriÃ³ un error al crear partida");
                    }

                } catch (Exception e) {

                }
                break;
            case 2:
                try {

                    File archivo = new File("C:\\user\\Personaje2.txt");

                    boolean estatus = archivo.delete();

                    if (!estatus) {

                        //System.out.println("Error no se ha podido eliminar el  3");
                    } else {

                        System.out.println("Se ha eliminado el archivo 2 exitosamente");

                    }

                } catch (Exception e) {

                    System.out.println(e);

                }
                f.mkdir();
                try {
                    file2.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Error archivo 2");
                }
                try (Scanner sc2 = new Scanner(file2)) {

                    try (FileWriter fw2 = new FileWriter(file2.getAbsoluteFile(), true)) {
                        String loquesea = "";
                        for (int i = 0; i < 9; i++) {
                            if (player.trajes[i] == true) {
                                loquesea = loquesea + ",1";
                            } else {
                                loquesea = loquesea + ",0";
                            }
                        }
                        for (int j = 0; j < 12; j++) {
                            if (player.armas[j] == true) {
                                loquesea = loquesea + ",1";
                            } else {
                                loquesea = loquesea + ",0";
                            }
                        }
                        BufferedWriter bw2 = new BufferedWriter(fw2);
                        bw2.write(player.trajeActual + "," + player.porteArmas[0] + "," + player.porteArmas[1] + "," + player.porteArmas[2] + "," + player.nombre + ","
                                + player.vida + "," + player.vigor + "," + player.dinero + loquesea);
                        bw2.newLine();
                        bw2.flush();
                        bw2.close();
                        fw2.close();

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "OcurriÃ³ un error al crear partida");
                    }

                } catch (Exception e) {

                }
                break;
            case 3:
                try {

                    File archivo = new File("C:\\user\\Personaje3.txt");

                    boolean estatus = archivo.delete();

                    if (!estatus) {

                        //System.out.println("Error no se ha podido eliminar el  3");
                    } else {

                        System.out.println("Se ha eliminado el archivo 3 exitosamente");

                    }

                } catch (Exception e) {

                    System.out.println(e);

                }
                f.mkdir();
                try {
                    file3.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Error archivo 3");
                }
                try (Scanner sc3 = new Scanner(file3)) {
                    try (FileWriter fw = new FileWriter(file3.getAbsoluteFile(), true)) {
                        String loquesea = "";
                        for (int i = 0; i < 9; i++) {
                            if (player.trajes[i] == true) {
                                loquesea = loquesea + ",1";
                            } else {
                                loquesea = loquesea + ",0";
                            }
                        }
                        for (int j = 0; j < 12; j++) {
                            if (player.armas[j] == true) {
                                loquesea = loquesea + ",1";
                            } else {
                                loquesea = loquesea + ",0";
                            }
                        }
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(player.trajeActual + "," + player.porteArmas[0] + "," + player.porteArmas[1] + "," + player.porteArmas[2] + "," + player.nombre + ","
                                + player.vida + "," + player.vigor + "," + player.dinero + loquesea);
                        bw.newLine();
                        bw.flush();
                        bw.close();
                        fw.close();

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "OcurriÃ³ un error al crear partida");
                    }

                } catch (Exception e) {

                }
                break;
        }
    }

   

}
