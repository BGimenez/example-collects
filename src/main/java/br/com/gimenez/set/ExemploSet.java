package br.com.gimenez.set;

public class ExemploSet {
    public static void main(String[] args) {
        //Nao garante ordem de insercao
        //Nao permite itens repetidos
        //Nao possui busca por item e atualizacao
        //Leitura somente navegacao
        //Nao permite mudar a ordem

        //HashSet
        //- Quando nao é necessario ordenacao
        //- Nao é ordenado e nao permite valores repetidos
        //- Mais performatica

        //LinkedHashSet
        //- Quando é necessario manter a ordem de insercao dos elementos
        //- Mantem a ordem de insercao
        //- Mais lenta

        //TreeSet
        //- Quando é necessario alterar ordenacao através de comparators
        //- Mantem a ordem e pode ser reordenado
        //- É performatico para leitura, para modificacao tem a necessidade de reordenar, tornando mais lento

    }
}
