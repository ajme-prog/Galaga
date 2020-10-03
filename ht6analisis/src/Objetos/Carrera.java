package Objetos;

public class Carrera {

    private int codigo;
    private String descripcion;

    public Carrera(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int procesarCarrera() throws Exception{
        if (codigo > 0 && codigo <= 3) {
            return 2;
        }else if(codigo > 3 && codigo <= 6){
            return 4;
        }else if(codigo > 6 && codigo <= 9){
            return 1;
        }else if (codigo > 9 && codigo <= 12){
            return 3;
        }else {
            throw new Exception("Carrera no valida");
        }
    }


}
