package com.drausiotronolone.xsena;

/**
 * Created by dtronolone on 1/21/15.
 */
public class Jogo {

    private int _id;
    private String _jogo;

    public Jogo(){

    }

    public Jogo(int id, String jogo)
    {
        this._id = id;
        this._jogo = jogo;
    }

    public Jogo(String jogo)
    {
        this._jogo = jogo;
    }


    public void setId(int id)
    {
        this._id = id;
    }

    public int getID()
    {
        return this._id;
    }

    public void setJogo(String jogo)
    {
        this._jogo = jogo;
    }

    public String getJogo()
    {
        return this._jogo;
    }

}
