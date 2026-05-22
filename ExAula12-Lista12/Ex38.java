import java.util.Scanner;

class NoDado {
    int numero;
    NoDado proximo;
}

class NoPosicao {
    int idPosicao;
    NoDado listaDados;
    NoPosicao proximoPosicao;
}

public class Ex38 {
    static NoPosicao inicioMultilista = null;

    static int contarDigitos(int num) {
        if (num == 0) return 1;
        int cont = 0;
        int n = Math.abs(num);
        while (n > 0) {
            cont++;
            n /= 10;
        }
        return cont;
    }

    static NoPosicao obterOuCriarPosicao(int id) {
        NoPosicao atual = inicioMultilista;
        NoPosicao anterior = null;

        while (atual != null) {
            if (atual.idPosicao == id) return atual;
            anterior = atual;
            atual = atual.proximoPosicao;
        }

        NoPosicao novaPos = new NoPosicao();
        novaPos.idPosicao = id;
        novaPos.listaDados = null;
        novaPos.proximoPosicao = null;

        if (anterior == null) {
            inicioMultilista = novaPos;
        } else {
            anterior.proximoPosicao = novaPos;
        }
        return novaPos;
    }

    static void inserir(int num) {
        int chavePosicao = contarDigitos(num);
        NoPosicao noPos = obterOuCriarPosicao(chavePosicao);

        NoDado novoDado = new NoDado();
        novoDado.numero = num;
        novoDado.proximo = null;

        if (noPos.listaDados == null) {
            noPos.listaDados = novoDado;
        } else {
            NoDado aux = noPos.listaDados;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novoDado;
        }
    }

    static void exibirMultilista() {
        NoPosicao auxPos = inicioMultilista;
        if (auxPos == null) {
            System.out.println("Multilista vazia.");
            return;
        }
        while (auxPos != null) {
            System.out.print("Chave (Digitos " + auxPos.idPosicao + "): ");
            NoDado auxDado = auxPos.listaDados;
            while (auxDado != null) {
                System.out.print("[" + auxDado.numero + "] -> ");
                auxDado = auxDado.proximo;
            }
            System.out.println("Nulo");
            auxPos = auxPos.proximoPosicao;
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            num = leitor.nextInt();
            if (num == -1) break;
            inserir(num);
        }

        System.out.println("\n--- Multilista hash ---");
        exibirMultilista();
        leitor.close();
    }
}
