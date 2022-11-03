public class No { private long id; private Object elemento; private Main.No esq;
    private Main.No dir;
    public No (long id, Object elemento, Main.No esq, Main.No dir) { this.id = id;
        this.elemento = elemento; this.esq = esq; this.dir = dir; }
    public void setId(long id) {  this.id = id; } public long getId() {
        return this.id; }
    public void setElemento(Object elemento) {  this.elemento = elemento; }
    public Object getElemento() {  return elemento; }
    public void setEsq(Main.No esq) {  this.esq = esq; }
    public Main.No getEsq(){  return esq; }
if (atual != null) { long e,d; e = calcAltura(atual.getEsq(),a)+1;
        d = calcAltura(atual.getDir(),a)+1; if (e > d) { return a+e; } else {
            return a+d; }} return a; } private long calcEsq(Main.No atual, long a) {
    if (atual != null) { long e,d; e = calcEsq(atual.getEsq(),a)+1;
        return a+e; } return a; } public long alturaArvore() { long a = 0; System.out.println(" ");
    return calcAltura(raiz,a); }  public long totalEsquerda(){ long es = 0;
    return calcEsq(raiz, es); }}

