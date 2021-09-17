package DB;

public class RentDto {
  private int Id ;
  private int Price ;
  
  public RentDto(){}
  
  public RentDto(int id,int price)
  {
  SetId( id);
  SetPrice( price);
  }
  
  public void SetId( int id){
  Id=id;
  }
  public void SetPrice( int Price){
  this.Price=Price;
  }
  public int GetId(){
  return this.Id;
  }
   public int GetPrice(){
  return this.Price;
  }
  
  
}
