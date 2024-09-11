class NoOperador extends No {
    private No esquerdo, direito;
    private char operador;

    public NoOperador(char operador, No esquerdo, No direito) {
        this.operador = operador;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public float visitar() {
        float valorEsquerdo = esquerdo.visitar();
        float valorDireito = direito.visitar();

        switch (operador) {
            case '+': return valorEsquerdo + valorDireito;
            case '-': return valorEsquerdo - valorDireito;
            case '*': return valorEsquerdo * valorDireito;

        }
    }
}