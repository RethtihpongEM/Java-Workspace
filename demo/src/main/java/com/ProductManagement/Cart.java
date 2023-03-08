package com.ProductManagement;

import com.DatabaseFunction.DBConnection;
import com.DatabaseFunction.QueryCart;
import com.DatabaseFunction.QueryProduct;
<<<<<<< HEAD
import com.DatabaseFunction.TemporaryQuery;
=======
>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb

import java.sql.*;
import java.util.ArrayList;

public class Cart extends QueryCart {
  private int productID;
  private String productName;
  private float productPrice;
  private int productQty;
  private int totalPrice;
  private int cartID;
  private boolean seen;
  private final ArrayList<Cart> cartProducts = new ArrayList<>();
  private DBConnection con = new DBConnection();
  private Statement statement;
  private PreparedStatement st;
  private Connection connection;
<<<<<<< HEAD
  private Cart cart;
=======
  Cart cart;

>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb
  public Cart() throws Exception {
    super("jdbc:mysql://localhost:3306/possys", "root", "");
    this.connection = con.getConnection("jdbc:mysql://localhost:3306/possys", "root", "");
    this.statement = connection.createStatement();
  }

  // setter
  public void setProductName(String productName) {
    this.productName = productName;
  }

  public void setSeen(boolean seen) {
    this.seen = seen;
  }

  public void setProductPrice(float productPrice) {
    this.productPrice = productPrice;
  }

  public void setProductQty(int productQty) {
    this.productQty = productQty;
  }

  public void setCartID(int cartID) {
    this.cartID = cartID;
  }

  public void setProductID(int productID) {
    this.productID = productID;
  }

  // getter

  public boolean isSeen() {
    return seen;
  }

  public int getProductID() {return productID;}

  public String getProductName() {
    return productName;
  }

  public float getProductPrice() {
    return productPrice;
  }

  public int getProductQty() {
    return productQty;
  }

  public int getCartID() {
    return cartID;
  }

  public ArrayList<Cart> readCartDB() throws Exception {
    Cart cart;
    ResultSet resultSet = statement.executeQuery("select * from cartproducts");
    while (resultSet.next()) {
      cart = new Cart();
      cart.setCartID(resultSet.getInt("cartID"));
      cart.setProductID(resultSet.getInt("productID"));
      cart.setProductName(resultSet.getString("productName"));
      cart.setProductPrice(resultSet.getFloat("productPrice"));
      cart.setProductQty(resultSet.getInt("productQty"));
      cartProducts.add(cart);
    }
    return cartProducts;
  }

  public int getID() throws Exception {
    if(readCartDB().isEmpty()){
      return 10000;
    } else {
      int tmpID = readCartDB().get(readCartDB().size()-1).getCartID();
      return tmpID + 1;
    }
  }

  public void saveToDb(ArrayList<Cart> cart) throws Exception {
    String insertStm = "insert into cartProducts (cartID, productID, productName, productPrice, productQty, subPrice) values (?, ?, ?, ?, ?, ?)";
    this.st = connection.prepareStatement(insertStm);
    int newID = getID();
    for (int i = 0; i < cart.size(); i++) {
      cart.get(i).setCartID(newID);
      st.setInt(1, cart.get(i).getCartID());
      st.setInt(2, cart.get(i).getProductID());
      st.setString(3, cart.get(i).getProductName());
      st.setFloat(4, cart.get(i).getProductPrice());
      st.setInt(5, cart.get(i).getProductQty());
      st.setFloat(6, cart.get(i).getProductQty()*cart.get(i).getProductPrice());
      st.executeUpdate();
    }
  }

  public void addToCart(int productID, String productName, float productPrice, int productQty) {
    setProductID(productID);
    setProductName(productName);
    setProductPrice(productPrice);
    setProductQty(productQty);
  }

  public void displayCartProducts(ArrayList<Cart> cartProductst) {
    for (int i = 0; i < cartProducts.size(); i++) {
      System.out.println("Product ID: " + cartProducts.get(i).productID);
      System.out.println("Product name: " + cartProducts.get(i).productName);
      System.out.println("Product Price: " + cartProducts.get(i).productPrice);
      System.out.println("Product Quantity: " + cartProducts.get(i).productQty);
      System.out.println();
    }
  }

  public void displayItem() {
    System.out.println("Product ID: " + productID);
    System.out.println("Product Name: " + productName);
    System.out.println("Product Price: " + productPrice);
    System.out.println("Product Qty: " + productQty);
  }

  public void displayCartByID(int cartID) {
    try {
      displayCart(cartID);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public Cart searchProduct(int pid) {
    try {
      return searchFromProduct(pid);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }

  public void updateCartItem(int productID, int productQty) {
    try {
      updateCartProduct(productID, productQty);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
<<<<<<< HEAD
  public void removeCart(int cartID){
    try{
      deleteCart(cartID);
    } catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
  public void removeCartProduct(int productID){
    try{
      deleteCartProduct(productID);
    } catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

}
=======
}


//  select cartid, group_concat(productName separator ', ') as "Product Name", GROUP_concat(productPrice separator ', ') as "ProductPrice", Group_concat(productQty separator ', ') as "Product Qty" from cartproducts group by cartId;
>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb
