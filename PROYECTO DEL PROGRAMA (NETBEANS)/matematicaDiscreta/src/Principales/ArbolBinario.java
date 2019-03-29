/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

public class ArbolBinario {

    Nodo raiz;
    int cant;
    int altura;

    class Nodo {

        int info;
        Nodo izq, der;

    }

    public ArbolBinario() {

        raiz = null;

    }

    public void vaciar() {

        raiz = null;

    }

    public void insertar(int info) {

        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;

        if (raiz == null) {

            raiz = nuevo;

        } else {

            Nodo anterior = null, reco;
            reco = raiz;

            while (reco != null) {

                anterior = reco;

                if (info < reco.info) {
                    
                    reco = reco.izq;
                    
                } else {
                    
                    reco = reco.der;
                    
                }

            }

            if (info < anterior.info) {

                anterior.izq = nuevo;

            } else {

                anterior.der = nuevo;

            }

        }

    }

    private void imprimirPre(Nodo reco) {

        if (reco != null) {

            recorridoVerticesInternos.resultado.append(reco.info + " - ");
            recorridosArbolBinario.resultado.append(reco.info + " - ");
            imprimirPre(reco.izq);
            imprimirPre(reco.der);

        }

    }

    public void imprimirPre() {

        imprimirPre(raiz);
        System.out.println();

    }

    private void imprimirEntre(Nodo reco) {

        if (reco != null) {

            imprimirEntre(reco.izq);
            recorridosArbolBinario.resultado.append(reco.info + " - ");
            recorridoVerticesInternos.resultado.append(reco.info + " - ");
            imprimirEntre(reco.der);

        }

    }

    public void imprimirEntre() {

        imprimirEntre(raiz);
        System.out.println();

    }

    private void imprimirPost(Nodo reco) {

        if (reco != null) {

            imprimirPost(reco.izq);
            imprimirPost(reco.der);
            recorridosArbolBinario.resultado.append(reco.info + " - ");
            recorridoVerticesInternos.resultado.append(reco.info + " - ");

        }

    }

    public void imprimirPost() {

        imprimirPost(raiz);
        System.out.println();

    }

    public boolean existe(int info) {

        Nodo reco = raiz;

        while (reco != null) {

            if (info == reco.info) {

                return true;

            } else if (info > reco.info) {

                reco = reco.der;

            } else {

                reco = reco.izq;

            }

        }

        return false;

    }

    private void cantidad(Nodo reco) {

        if (reco != null) {

            cant++;
            cantidad(reco.izq);
            cantidad(reco.der);

        }

    }

    public int cantidad() {

        cant = 0;
        cantidad(raiz);

        return cant;

    }

    private void cantidadNodosHoja(Nodo reco) {

        if (reco != null) {

            if (reco.izq == null && reco.der == null) {

                cant++;

            }

            cantidadNodosHoja(reco.izq);
            cantidadNodosHoja(reco.der);

        }

    }

    public int cantidadNodosHoja() {

        cant = 0;
        cantidadNodosHoja(raiz);

        return cant;

    }

    private void imprimirEntreConNivel(Nodo reco, int nivel) {

        if (reco != null) {

            imprimirEntreConNivel(reco.izq, nivel + 1);
            recorridoVerticesInternos.resultado.append(" " + reco.info + " (" + nivel + ") - ");
            recorridosArbolBinario.resultado.append(" " + reco.info + " (" + nivel + ") - ");
            imprimirEntreConNivel(reco.der, nivel + 1);

        }

    }

    public void imprimirEntreConNivel() {

        imprimirEntreConNivel(raiz, 0);
        System.out.println();

    }

    private void retornarAltura(Nodo reco, int nivel) {

        if (reco != null) {

            retornarAltura(reco.izq, nivel + 1);

            if (nivel > altura) {

                altura = nivel;

            }

            retornarAltura(reco.der, nivel + 1);

        }

    }

    public int retornarAltura() {

        altura = 0;
        retornarAltura(raiz, 0);

        return altura;

    }

    public void mayorValorl() {

        if (raiz != null) {

            Nodo reco = raiz;

            while (reco.der != null) {

                reco = reco.der;

            }

            recorridosArbolBinario.resultado.append(" El mayor valor es: " + reco.info);

        }

    }

    private void NodosHoja(Nodo reco) {

        if (reco != null) {

            if (reco.izq != null || reco.der != null) {

                recorridoVerticesInternos.resultado.append(reco.info + " - ");

            }

            NodosHoja(reco.izq);
            NodosHoja(reco.der);

        }

    }

    public void NodosHoja() {

        NodosHoja(raiz);

    }

}
