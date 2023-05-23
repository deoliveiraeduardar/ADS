#codigo q13
def codigo_q13(b):
    pilha_restos = []

    while b > 0:
        resto = b % 2
        pilha_restos.append(resto)
        b = b // 2
    saida = []
    while pilha_restos:
        saida.append(str(pilha_restos.pop()))
    return ''.join(saida)