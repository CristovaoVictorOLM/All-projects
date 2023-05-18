import 'dart:math';

void main(List<String> args) {
  var rng = Random();
  var Idade = List.generate(20, (_) => rng.nextInt(60) + 10);
  var nota = List.generate(20, (_) => rng.nextInt(3) + 1);

  int somaIdadesExcelente =0;
  int contadorExcelente =0;
  int contadorRegular =0;
  int contadorBom =0;

  for (int i = 0; i < Idade.length; i++) {
    if (nota[i] == 3) {
      somaIdadesExcelente += Idade[i];
      contadorExcelente++;
    } else if (nota[i] == 2) {
      contadorBom++;
    } else if (nota[i] == 1) {
      contadorRegular++;
    }
}

double percentualBom = (contadorBom / Idade.length) * 100;
double mediaIdadesExcelente = somaIdadesExcelente / contadorExcelente.toDouble();

print(Idade);
print(nota);
print('Média das idades das pessoas que responderam excelente: $mediaIdadesExcelente');
print('Quantidade de pessoas que responderam regular: $contadorRegular');
print('Percentagem de pessoas que responderam bom entre todos os espectadores analisados: $percentualBom%');
}