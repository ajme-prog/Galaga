package Objetos;


public class Estudiante {
    
    private Carrera carrera;
    private RegistroAcademico registroAcademico;
    private Horario horario;

    public Estudiante(Carrera carrera, RegistroAcademico registroAcademico) throws Exception {
        this.carrera = carrera;
        this.registroAcademico = registroAcademico;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public RegistroAcademico getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(RegistroAcademico registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }


    
    
    
    
    
}
