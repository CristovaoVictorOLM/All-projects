import 'dart:io';

void main() {
  int carteira, multas, maiorMultas = 0, carteiraMaiorMultas = 0;
  double valorMultas, divida, totalArrecadado = 0.0;

  do {
    print("Digite o número da carteira de motorista (de 1 a 4327):");
    carteira = int.parse(stdin.readLineSync()!);

    if (carteira >= 1 && carteira <= 4327) {
      print("Digite o número de multas:");
      multas = int.parse(stdin.readLineSync()!);

      print("Digite o valor de cada multa:");
      valorMultas = double.parse(stdin.readLineSync()!);

      divida = multas * valorMultas;
      totalArrecadado += divida;

      if (multas > maiorMultas) {
        maiorMultas = multas;
        carteiraMaiorMultas = carteira;
      }

      print("O valor da dívida para o motorista $carteira é: R\$$divida\n");
    }
  } while (carteira >= 1 && carteira <= 4327);

  print("O total de recursos arrecadados foi de: R\$$totalArrecadado");
  print("A carteira de motorista com maior número de multas é: $carteiraMaiorMultas");
}