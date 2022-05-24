public class Algoritmo2 {
  public static void main(String[] args) {
    int vet[] = { 5, 3, 2, 6, 8, 9, 4, 1, 6, 9 };
    int posMenor = 0;
    int maior = vet[0];
    int menor = vet[0];
    for (int i = 0; i < 10; i++) {

      if (maior < vet[i]) {
        maior = vet[i];
      }
      if (menor > vet[i]) {
        menor = vet[i];
        posMenor = i + 1;
      }
    }
    float media = (maior + menor) / 2;
    System.out.println("o MAIOR: " + maior + " - posição do MENOR: " + posMenor + " - MÉDIA: " + media);
  }
}
