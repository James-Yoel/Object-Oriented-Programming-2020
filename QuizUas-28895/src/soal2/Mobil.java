package soal2;

public class Mobil implements Komponen{
	public static void main(String[] args){
        Mobil data = new Mobil();
        data.mesin();
        data.design();
    }

    @Override
    public void mesin() {
        System.out.println("Kecepatan Mobil: "+kecepatan);
    }

    @Override
    public void design() {
        System.out.println("Mempunyai Model: "+model);
    }
}
