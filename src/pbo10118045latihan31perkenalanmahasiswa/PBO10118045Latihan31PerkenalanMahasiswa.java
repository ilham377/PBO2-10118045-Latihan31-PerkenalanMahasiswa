/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan31perkenalanmahasiswa;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : perkenalan mahasiswa
 */
public class PBO10118045Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        Mahasiswa mhs4 = new Mahasiswa();
        mhs1.setnim("10110265");mhs1.setnama("Riski Adam Kurniawan");
        mhs2.setnim("10110270");mhs2.setnama("Indra Tiola");
        mhs3.setnim("10110271");mhs3.setnama("Robi Tanzil Ganefi");
        mhs4.setnim("10110269");mhs4.setnama("Muhammad Nur Awaludin");
        mhs1.perkenalkanDiri();
        mhs2.perkenalkanDiri();
        mhs3.perkenalkanDiri();
        mhs4.perkenalkanDiri();
    }
    
}
