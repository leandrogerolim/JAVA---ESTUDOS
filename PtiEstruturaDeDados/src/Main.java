public class Main {
    public static void main(String[] args) {
        //A
        // public class No {

            private long id; private Object elemento; private No esq; private No dir;
            public No(long id, Object elemento, No esq, No dir) {
                this.id = id; this.elemento = elemento; this.esq = esq; this.dir = dir;}
            public void setId(long id) { this.id = id; }
            public long getId() { return this.id;}
            public void setElemento(Object elemento) { this.elemen to = elemento;}
            public Object getElemento() { return elemento;}
            public void setEsq(No esq) { this.esq = esq;}
            public No getEsq() { return esq;}
            public void setDir(No dir) { this.dir = dir;}
            public No getDir() { return dir;}}
        public class ArvoreBinaria {
            private No raiz; Integer esquerda = 0; public ArvoreBinaria() {
                this.raiz = null; }
            public void insere(long id, Object elemento) { No novoNo = new No(id, elemento, null, null);
                if (raiz == null) { raiz = novoNo; } else { No atual = raiz; No pai; while (true) {
                    pai = atual;
                    if (id < atual.getId()) {  atual = atual.getEsq();
                        if (atual == null) { pai.setEsq(novoNo);
                            return;
                        } } else { atual = atual.getDir();
                        if (atual == null) { pai.setDir(novoNo);
                            return; }}}}}
            private void preFixado(No atual) {if (atual != null) {
                System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
                preFixado(atual.getDir()); preFixado(atual.getEsq());
                if(atual.getEsq() != null) { esquerda++;}}}
            public void imprimeElementosArvore() {  preFixado(raiz);
                System.out.println("Total de nós a esquerda: " + esquerda); }}


