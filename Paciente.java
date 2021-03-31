
package com.mycompany.actividad6rea2;



public class Paciente {
    private String nombre;
    private String apellido;
    private String sexo;
    private String direccionDresidencia;
    private String dondefueAtendido;
    private String motivoConsulta;
    private String medicoQAtendio;
    private String fecha;

    public Paciente(){
        this.nombre=null;
        this.apellido=null;
        this.sexo=null;
        this.direccionDresidencia=null;
        this.dondefueAtendido=null;
        this.motivoConsulta=null;
        this.medicoQAtendio=null;
        this.fecha=null;
        
    }
    
    public Paciente(String nombre,String apellido, String sexo,String direccinDresidencia, String dondefueAtendido, String motivoConsulta, String medicoQAtendio, String fecha){
        this.nombre = nombre ;
        this.apellido=apellido;
        this.sexo=sexo;
        this.direccionDresidencia=direccinDresidencia;
        this.dondefueAtendido=dondefueAtendido;
        this.motivoConsulta=motivoConsulta;
        this.medicoQAtendio=medicoQAtendio;
        this.fecha=fecha;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccionDresidencia() {
        return direccionDresidencia;
    }

    public void setDireccionDresidencia(String direccionDresidencia) {
        this.direccionDresidencia = direccionDresidencia;
    }

    public String getDondefueAtendido() {
        return dondefueAtendido;
    }

    public void setDondefueAtendido(String dondefueAtendido) {
        this.dondefueAtendido = dondefueAtendido;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMedicoQAtendio() {
        return medicoQAtendio;
    }

    public void setMedicoQAtendio(String medicoQAtendio) {
        this.medicoQAtendio = medicoQAtendio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
        
        public void MostrarPaciente (){
            
        }
        
        

}

