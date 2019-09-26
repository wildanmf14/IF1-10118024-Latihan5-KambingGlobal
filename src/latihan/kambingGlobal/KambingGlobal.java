package latihan.kambingGlobal;

public class KambingGlobal {
	/*
    Nama        : Wildan Muhammad Fikri
    Kelas       : IF1
    NIM         : 10118044
    Deskripsi   : var global
     */
	int jumlahKambing = 88;

    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();

        kambingSusu.getJumlahKambing();

        kambingSusu.tambahKambing();

        kambingSusu.getJumlahKambing();
    }

}
