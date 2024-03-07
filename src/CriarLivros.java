public class CriarLivros {
    public static void main(String[] args) {

     Livro favorito = new Livro();
     favorito.titulo = "E assim que acaba";
     favorito.autor = "Collen Hoover";
     favorito.editora = "Galera";
     favorito.paginas = 228;
     favorito.valor = 47.99;
     favorito.resumo = "jduwqudiwjdojowjo";
     favorito.tipoCapa = "capa dura";

        System.out.println("Meu livro favorito é:" + favorito.titulo +
                "qual o valor:" + favorito.valor);


    }

}
