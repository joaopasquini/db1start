#include <stdio.h>
        #include <stdlib.h>
        #include <conio.h>
        #include <time.h>

        const int tamVetor = 25;
        const int tamTabela = 31;

        typedef struct tipoElemento
        {
        int valor;
        struct tipoElemento *proximo;
        }TElemento;

        typedef struct tipoLista
        {
        TElemento *inicio;
        TElemento *fim;
        }TLista;

        void inicializar(TLista tabela[])
        {
        int i;
        for (i=0; i<tamTabela; i++)
        {
        tabela[i].inicio = NULL;
        tabela[i].fim = NULL;
        }
        }

        int hash (int valor)
        {
        int indice;
        indice = valor % tamTabela;
        return indice;
        }

        void inserir (TLista tabela[])
        {
        int valor;

        printf("\n Informe valor para armazenar na tabela: ");
        scanf("%d", &valor);

        int indice;
        indice = hash(valor);

        TElemento *novo;
        novo = new TElemento;

        novo->valor = valor;
        novo->proximo = NULL;

        //if (p->inicio == NULL)
        //{
        //	p->inicio = novo;
        //	p->fim = novo;
        //}

        if (tabela[indice].inicio == NULL)
        {
        tabela[indice].inicio = novo;
        tabela[indice].fim = novo;
        }
        else
        {
        tabela[indice].fim->proximo = novo;
        tabela[indice].fim = novo;
        }
        }

        void inserirVetorDireto (TLista tabela[],int listaNumeros[])
        {

        for(int i = 0 ; i< tamVetor ; i++){
        int valor = listaNumeros[i];

        int indice;
        indice = hash(valor);

        TElemento *novo;
        novo = new TElemento;

        novo->valor = valor;
        novo->proximo = NULL;

        //if (p->inicio == NULL)
        //{
        //	p->inicio = novo;
        //	p->fim = novo;
        //}

        if (tabela[indice].inicio == NULL)
        {
        tabela[indice].inicio = novo;
        tabela[indice].fim = novo;
        }
        else
        {
        tabela[indice].fim->proximo = novo;
        tabela[indice].fim = novo;
        }

        }
        }

        void apresentar (TLista tabela[])
        {
        int i;

        for (i=0; i<tamTabela; i++)
        {
        if (tabela[i].inicio != NULL)
        {
        printf("\n Indice [%d]: ", i);
        TElemento *aux = tabela[i].inicio;
        while (aux != NULL)
        {
        printf("%d //", aux->valor);
        aux = aux->proximo;
        }
        }
        else
        {
        printf("\n Indice: %d: //", i);
        }
        }
        }

        int verificarValorNaTabela(TLista tabela[], int valorPesquisado)
        {
        int indice;
        indice = hash(valorPesquisado);

        TElemento *aux;
        aux = tabela[indice].inicio;
        while (aux != NULL)
        {
        if (aux->valor == valorPesquisado)
        {
        return 1;
        }
        else
        {
        aux = aux->proximo;
        }
        }
        return 0;
        }

        void consultar (TLista tabela[])
        {
        int valorPesquisado;

        printf("\n Informe valor para busca: ");
        scanf("%d", &valorPesquisado);

        if (verificarValorNaTabela(tabela, valorPesquisado) == 1)
        {
        printf("\n Valor Encontrado!");
        }
        else
        {
        printf("\n Valor nao Encontrado!");
        }
        }

        void calcularTaxaDeOcupacao(TLista tabela[]){
        int contador = 0;

        for(int i = 0 ; i < 9 ; i++){
        if(tabela[i].inicio != NULL){
        contador++;
        }
        }

        int taxa = 10*contador;

        printf("\n\nTaxa de Ocupacao : %d %%",taxa);
        }

        void preencherVetor(int vetor[],int limInferior, int limSuperior) {
        srand(time(NULL));
        for (int i = 0; i < tamVetor; i++) {
        vetor[i] = (rand() %  (limSuperior - limInferior + 1)) + limInferior;
        }

        }

        int main()
        {
        int opcao;

        TLista tabelaHashing[10];

        int vetorDeNumeros[tamVetor];

        preencherVetor(vetorDeNumeros,0,200);

        inicializar(tabelaHashing);



        do
        {
        printf("\n 1 - Inserir");
        printf("\n 2 - Consultar");
        printf("\n 3 - Apresentar");
        printf("\n 4 - Inserir Vetor");
        printf("\n 5 - Calcular Taxa de Ocupacao");
        printf("\n 0 - Sair");
        printf("\n Escolha uma opcao: ");
        scanf("%d", &opcao);
        switch(opcao)
        {
        case 1: inserir(tabelaHashing); break;
        case 2: consultar(tabelaHashing); break;
        case 3: apresentar(tabelaHashing); break;
        case 4: inserirVetorDireto(tabelaHashing,vetorDeNumeros);break;
        case 5: calcularTaxaDeOcupacao(tabelaHashing); break;
        }
        }while (opcao != 0);
        }