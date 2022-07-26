package br.com.gimenez.map;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {

        //Nao permite chaves repetidas, mas valores sim
        //Pode ser ordenado

        //Exemplos
        exemploHashMap();
        exemploTreeMap(); //Tem ordenacao propria
    }

    public static void exemploHashMap() {

        Map<String, Integer> campeoesFifa = new HashMap<>();
        campeoesFifa.put("Brasil", 5);
        campeoesFifa.put("Alemanha", 4);
        campeoesFifa.put("Itália", 4);
        campeoesFifa.put("Uruguai", 2);
        campeoesFifa.put("Argentina", 2);
        campeoesFifa.put("França", 2);
        campeoesFifa.put("Inglaterra", 1);
        campeoesFifa.put("Espanha", 1);

        System.out.println(campeoesFifa);

        //Atualiza valor para a chave informada
        campeoesFifa.put("Brasil", 6);
        System.out.println(campeoesFifa);

        //Retorna valor da chave informada
        System.out.println(campeoesFifa.get("Argentina"));

        //Retorna se existe ou nao chave
        System.out.println(campeoesFifa.containsKey("Argentina"));

        //Remove de acordo com a chave
        campeoesFifa.remove("França");

        //Retorna se existe ou nao alguma chave contendo o valor passado
        System.out.println(campeoesFifa.containsValue(6));

        //Retorna o tamanho
        System.out.println(campeoesFifa.size());

        //Navegacao
        for (Map.Entry<String, Integer> entry : campeoesFifa.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        //Navegacao
        for (String chave : campeoesFifa.keySet()){
            System.out.println(chave + "--->" + campeoesFifa.get(chave));
        }
    }

    public static void exemploTreeMap() {

        TreeMap<String, String> treeCapitais = new TreeMap<>();
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira chave no topo da arvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a ultima chave no final da arvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira chave abaixo da árvore da chave informada
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira chave acima da árvore da chave informada
        System.out.println(treeCapitais.higherKey("SC"));

        //Retorna a primeira chave no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey() + "-" + treeCapitais.firstEntry().getValue());

        //Retorna a ultima chave no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey() + "-" + treeCapitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo da árvore da capital informada
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + "-" + treeCapitais.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima da árvore da capital informada
        System.out.println(treeCapitais.higherEntry("SC").getKey() + "-" + treeCapitais.higherEntry("SC").getValue());

        //Retorna a primeira capital no topo da arvore e remove
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println(firstEntry.getKey() + "-" + firstEntry.getValue());

        //Retorna a primeira capital no final da arvore e remove
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(lastEntry.getKey() + "-" + lastEntry.getValue());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("-->" + treeCapitais.get(key));
        }

        for (String capital : treeCapitais.keySet()){
            System.out.println(capital + "-" + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + "-" + capital.getValue());
        }
    }
}
