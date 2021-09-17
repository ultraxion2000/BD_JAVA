
package DB;


public class ShopDto {
    private int id;
    private String name_shop;
    private int user_id;
    private int room_id;
    public ShopDto(){}
    public ShopDto(int id, String  name_shop,int user_id, int room_id){
    SetId(  id);
    SetName_Shop(  name_shop);
    SetUser_id( user_id);
    SetRoom_id( room_id);
    }
    
  public void SetId( int id){
  this.id=id;
  }
  public int GetId(){
  return this.id;
  }
  public void SetName_Shop( String name_shop){
  this.name_shop=name_shop;
  }
  public String GetName_Shop(){
  return this.name_shop;
  }
  public void SetUser_id( int user_id){
  this.user_id=user_id;
  }
  public int GetUser_id(){
  return this.user_id;
  }
  public void SetRoom_id( int room_id){
  this.room_id=room_id;
  }
  public int GetRoom_id(){
  return this.room_id;
  }
  
  
}
