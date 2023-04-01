import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(5);

        //Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;
        for(int i = 1; i < 6; i++){
            list.add(i);
        }
        System.out.println(list);

        //Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
        for(int i = 4; i > -1; i--){
            list.remove(i);
        }
        System.out.println(list);

        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = 1;i < 6; i++) {
            pilha.push(i);
        }
        System.out.println(pilha);

        //Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);
        pilha.clear();
        ArrayDeque fila = new ArrayDeque<>(10);
        for (int i=1;i<=5;i++){
            fila.push(i);
        }
        System.out.println(fila);

        //Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;
        for (int i= 6;i < 11; i++){
            list.add(i);
        }
        System.out.println(list);

        //Passo 5: Repita os passos 2 e 3.
        for(int i = 4; i > -1; i--){
            list.remove(i);
        }
        System.out.println(list);

        for (int i = 6;i < 11; i++){
            pilha.push(i);
        }
        System.out.println(pilha);

        pilha.clear();
        System.out.println(pilha);

        for (int i = 6;i < 11; i++){
            fila.push(i);
        }
        System.out.println(fila);
    }
}