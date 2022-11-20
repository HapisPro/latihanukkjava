/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hafizh Ak
 */
public class database implements Serializable{
    ArrayList<user> listUser;
    ArrayList<catatan> listCatatan;

    public database() {
        listUser = new ArrayList<>();
        listCatatan = new ArrayList<>();
    }
    
//    Simpan data
    public void saveDataUser(user u) {
        String filename = "src/file";
        File f = new File(filename);
        if (f.exists()) {
            loadDataUser();
        } else {
            f.mkdirs();
        }
        this.listUser.add(u);
        try {
            FileOutputStream writeData = new FileOutputStream(filename+"/Config.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            
            writeStream.writeObject(this.listUser);
            writeStream.flush();
            writeStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
//    load data
    public void loadDataUser() {
        try {
            String filename = "src/file/Config.txt";
            FileInputStream readData = new FileInputStream(filename);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            
            this.listUser = (ArrayList<user>) readStream.readObject();
            readStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
//    mencari user
    public user searchUser(String nik, String nama) {
        user u = null;
        loadDataUser();
        for (int i = 0; i < this.listUser.size(); i++) {
            if (this.listUser.get(i).getNik().equals(nik) && this.listUser.get(i).getNama().equals(nama)) {
                u = this.listUser.get(i);
            }
        }
        return u;
    }
    
    public boolean duplikat(String nik) {
        boolean userexist = false;
        loadDataUser();
        for (int i = 0; i < this.listUser.size(); i++) {
            if (this.listUser.get(i).getNik().equals(nik)) {
                userexist = true;
            }
        }
        return userexist;
    }
    
//    load data catatan
    public void loadDataCatatan(String nik) {
        try {
            String filename = "src/file/catatan-"+nik+".txt";
            FileInputStream readData = new FileInputStream(filename);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            
            this.listCatatan = (ArrayList<catatan>) readStream.readObject();
            readStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
//    save data catatan
    public void saveDataCatatan(catatan c, String nik) {
        String filename = "src/file/catatan-"+nik+".txt";
        File f = new File(filename);
       
        this.listCatatan.add(c);
        try {
            FileOutputStream writeData = new FileOutputStream(filename);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            
            writeStream.writeObject(this.listCatatan);
            writeStream.flush();
            writeStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public ArrayList<catatan> getListCatatan() {
        return listCatatan;
    }
}
