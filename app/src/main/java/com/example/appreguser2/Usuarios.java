package com.example.appreguser2;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuarios implements Parcelable {
    private String nombre;
    private String contra;
    private String repContra;

    public Usuarios(String usuario, String contra, String repContra) {
        this.nombre = usuario;
        this.contra = contra;
        this.repContra = repContra;
    }

    protected Usuarios(Parcel in) {
        nombre = in.readString();
        contra = in.readString();
        repContra = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(contra);
        dest.writeString(repContra);
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
}
