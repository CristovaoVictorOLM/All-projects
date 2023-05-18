
def mover_discos(n, origem, destino, auxiliar):
    if n == 1:
        destino.append(origem.pop())
        print(f"Mover disco {n} de {origem} para {destino}")
    else:
        mover_discos(n-1, origem, auxiliar, destino)
        destino.append(origem.pop())
        print(f"Mover disco {n} de {origem} para {destino}")
        mover_discos(n-1, auxiliar, destino, origem)

def main():
    torre_A = [5, 4, 3, 2, 1]
    torre_B, torre_C = [], []

    print(f"Estado inicial das torres: {[torre_A, torre_B, torre_C]}")
    mover_discos(5, torre_A, torre_C, torre_B)
    print(f"Estado final das torres: {[torre_A, torre_B, torre_C]}")

if __name__ == '__main__':
    main()
