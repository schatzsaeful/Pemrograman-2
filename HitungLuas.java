/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung.luas;

/**
 *
 * @author fujitsu
 */
public class HitungLuas {

    /**
     * @param args the command line arguments
     */

    private int cariLuasPersegiPanjang;

    public HitungLuas(int panjang, int lebar) {
        this.cariLuasPersegiPanjang = panjang * lebar;
    }

    public HitungLuas(int jari2) {
        this.cariLuasLingkaran = jari2;
    }

    public static void main(String[] args) {
        // TODO code application logic here

    }
    
}
