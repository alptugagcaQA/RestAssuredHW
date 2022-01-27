package models;


public class OrderRequest
{
    public String username;
    public String password;

    public String firstname;
    public String lastname;
    public int totalprice;
    public boolean depositpaid;
    public BookingDates bookingdates;
    public String additionalneeds;


    public OrderRequest(String username , String password)
    {
        this.username = username;
        this.password = password;
    }

    public OrderRequest(String firstname , String lastname ,int totalprice ,boolean depositpaid,BookingDates bookingdates,String additionalneeds)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;

    }


}
