public class nomer1{
String nama;
String nim;
void isiData ( String nama,String nim) {

this.nama=nama;
this.nim=nim;

}
public static void main ( String [ ] args){

nomer1 mahasiswa = new nomer1 ( );
mahasiswa.isiData ("Aku","0818999");
System.out.println( "Nama : "+ mahasiswa.nama);
System.out.println( "Nim : " + mahasiswa.nim);

}

}