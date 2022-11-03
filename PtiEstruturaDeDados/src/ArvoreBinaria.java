public class ArvoreBinaria {
    private Main.No raiz; Integer esquerda = 0; public ArvoreBinaria() {
        this.raiz = null; }
    public void insere(long id, Object elemento) { Main.No novoNo = new Main.No(id, elemento, null, null);
        if (raiz == null) { raiz = novoNo; } else { Main.No atual = raiz; Main.No pai; while (true) {
            pai = atual;
            if (id < atual.getId()) {  atual = atual.getEsq();
                if (atual == null) { pai.setEsq(novoNo);
                    return;
                } } else { atual = atual.getDir();
                if (atual == null) { pai.setDir(novoNo);
                    return; }}}}}
    private void preFixado(Main.No atual) {if (atual != null) {
        System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
        preFixado(atual.getDir()); preFixado(atual.getEsq());
        if(atual.getEsq() != null) { esquerda++;}}}
    public void imprimeElementosArvore() {  preFixado(raiz);
        System.out.println("Total de nós a esquerda: " + esquerda); }}