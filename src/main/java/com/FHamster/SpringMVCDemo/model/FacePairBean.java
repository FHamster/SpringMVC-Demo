package com.FHamster.SpringMVCDemo.model;

public class FacePairBean
{
    private String id;
    private String img1;
    private String img2;

    public FacePairBean()
    {
        super();
    }

    public FacePairBean(String id, String img1, String img2)
    {
        this.id = id;
        this.img1 = img1;
        this.img2 = img2;
    }

    @Override
    public String toString()
    {
        return "FacePairBean{" +
                "id='" + id + '\'' +
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                '}';
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getImg1()
    {
        return img1;
    }

    public void setImg1(String img1)
    {
        this.img1 = img1;
    }

    public String getImg2()
    {
        return img2;
    }

    public void setImg2(String img2)
    {
        this.img2 = img2;
    }
}
