public class main{
    public static void main(String[] args){
        System.out.println("teste");
        Bilheteria bilheteria = Bilheteria.getInstance();
        
        bilheteria.getDb().initDb();
        bilheteria.listaDbInterface();
    } 

}
