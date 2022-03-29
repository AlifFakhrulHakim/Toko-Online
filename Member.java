
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Member implements User {

    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        this.namaMember.add("Alip #1");
        this.alamat.add("Pasuruan");
        this.telepon.add("081259400176");
        this.saldo.add(999999999);

        this.namaMember.add("Alip #2");
        this.alamat.add("Pasuruan");
        this.telepon.add("082143620017");
        this.saldo.add(888888888);

        this.namaMember.add("Alip #3");
        this.alamat.add("Pasuruan");
        this.telepon.add("08102664455");
        this.saldo.add(777777777);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }

    public void editSaldo(int saldo, int idMember) {
        this.saldo.set(saldo, idMember);
    }

    public int getJmlMember() {
        return this.namaMember.size();
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String telepon) {
        this.alamat.add(telepon);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);

    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);

    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);

    }

}
