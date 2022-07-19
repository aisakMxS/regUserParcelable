package com.example.appreguser2;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuarios implements Parcelable {
    private String nombre;
    private String contra;
    private String repContra;
    private String email;
    private String rol;

    public Usuarios(String nombre, String contra, String repContra, String email, String rol) {
        this.nombre = nombre;
        this.contra = contra;
        this.repContra = repContra;
        this.email = email;
        this.rol = rol;
    }

    protected Usuarios(Parcel in) {
        nombre = in.readString();
        contra = in.readString();
        repContra = in.readString();
        email = in.readString();
        rol = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(contra);
        dest.writeString(repContra);
        dest.writeString(email);
        dest.writeString(rol);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Usuarios> CREATOR = new Creator<Usuarios>() {
        @Override
        public Usuarios createFromParcel(Parcel in) {
            return new Usuarios(in);
        }

        @Override
        public Usuarios[] newArray(int size) {
            return new Usuarios[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getRepContra() {
        return repContra;
    }

    public void setRepContra(String repContra) {
        this.repContra = repContra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
