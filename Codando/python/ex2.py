'''Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando 
for informado um valor igual a -1 (que não deve ser armazenado).

Após esta entrada de dados, faça: Mostre a quantidade de valores que foram lidos; Exiba todos os valores na ordem em que foram informados, 
um ao lado do outro; Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro; Calcule e mostre a soma dos valores; 
Calcule e mostre a média dos valores; Calcule e mostre a quantidade de valores acima da média calculada; 
Calcule e mostre a quantidade de valores abaixo de sete; Encerre o programa com uma mensagem;'''

valores = []
while True:
    n = int(input('Digite um numero: '))
    quant = len(valores)
    valores.append(n)

    set = 7
    sete = [menor for menor in valores if menor <set]

    reverter = valores[::-1]

    if n == -1: 
        sete.remove(-1)
        valores.remove(-1)
        reverter.remove(-1)
        break

print(valores)
print("=======================================")
for n in reverter:
       print(n)

print("=======================================")
print(quant)
print("=======================================")
print(sete)

print("Programa finalizado!")