package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controler {
	
	private float downPayment;
	private Integer totalMonthlyDebt;
	private Integer totalGrossIncome;
	private float housingPayment;
	private float housingObligationPayment;
	
	@FXML
	private AnchorPane anchor;
	
	@FXML
	private TextField totalGrossIncomeBox;
	
	@FXML	
	private Label totalGrossIncomeLbl;
	
	@FXML
	private TextField totalMonthlyDebtBox;
	
	@FXML	
	private Label totalMonthlyDebtLbl;	

	@FXML	
	private ComboBox<Integer> termBox;
	
	@FXML
	private Label termLbl;
	
	@FXML	
	private TextField downPaymentBox;
	
	@FXML	
	private Label downPaymentLbl;
	
	@FXML	
	private ComboBox<String> outputBox;
	
	@FXML	
	private Label outputLbl;
	
	@FXML
	private ComboBox<String> obligationBox;
	
	@FXML
	private Label obligationLbl;
	
	@FXML
	private ComboBox<String> maxPayBox;
	
	@FXML
	private Label maxPayLbl;
	
	@FXML
	private ComboBox<String> mortgageBox;
	
	@FXML
	private Label mortgageLbl;	
	
	@FXML
	private Button updateBtn;
	
	@FXML
	private void update(){
		calcHousingPayment();
		calcHousingObligation();
		maxPay();
		mortgageFinanced();
	}
	
	
	@FXML
    private void initialize() {
		termBox.getItems().addAll(10, 15, 30);
		termBox.setValue(10);
	}
	
	@FXML
	private void downPaymentToFloat(){
		String text = downPaymentBox.getText();
		boolean value = isNumeric(text);
		if (value == true){
			float downPayment = Float.parseFloat(text);
			setDownPayment(downPayment);			
		}
		else
			if(value == false){
				downPaymentBox.clear();
			}
		
		
		
	}
	
	@FXML
	private void totalMonthlyDebtToInt(){
		String text = totalMonthlyDebtBox.getText();
		boolean value = isNumeric(text);
		if (value == true){
			Integer totalMonthlyDebt = Integer.parseInt(text);
			setTotalMonthlyDebt(totalMonthlyDebt);
		}
		else
			if (value == false){
				totalMonthlyDebtBox.clear();
			}
		
	}
	
	@FXML
	private void totalGrossIncomeToInt(){
		String text = totalGrossIncomeBox.getText();
		//System.out.println(text);
		boolean value = isNumeric(text);
		if (value == true){
			Integer totalGrossIncome = Integer.parseInt(text);
			setTotalGrossIncome(totalGrossIncome);			
		}
		else
			if (value == false){
				totalGrossIncomeBox.clear();
			}
		
		
	}
	
	

	public float getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(float downPayment) {
		this.downPayment = downPayment;
	}

	public Integer getTotalMonthlyDebt() {
		return totalMonthlyDebt;
	}

	public void setTotalMonthlyDebt(Integer totalMonthlyDebt) {
		this.totalMonthlyDebt = totalMonthlyDebt;
	}

	public Integer getTotalGrossIncome() {
		return totalGrossIncome;
	}

	public void setTotalGrossIncome(Integer totalGrossIncome) {
		this.totalGrossIncome = totalGrossIncome;
	}
	
	public float getHousingObligationPayment() {
		return housingObligationPayment;
	}

	public void setHousingObligationPayment(float housingObligationPayment) {
		this.housingObligationPayment = housingObligationPayment;
	}

	@FXML
	private void calcHousingPayment(){
		
		int gross = getTotalGrossIncome();
		//System.out.println(gross);

		float grossPayment = (float) gross;
		float payment = (float) ((grossPayment / 12.0) *.18);		
		setHousingPayment(payment);
		String paymentStr = Float.toString(payment);
		outputBox.getItems().clear();
		outputBox.getItems().add(paymentStr);
		outputBox.setValue("$" + paymentStr);

		
		//System.out.println(payment);
	}
	
	@FXML
	private void calcHousingObligation(){
		
		int gross = getTotalGrossIncome();
		int debt = getTotalMonthlyDebt();
		float grossPayment = (float) gross;
		float grossDebt = (float) debt;
		float payment = (float) (((grossPayment / 12.0) *.36) - grossDebt);
		String paymentStr = Float.toString(payment);
		
		setHousingObligationPayment(payment);
		obligationBox.getItems().clear();
		obligationBox.getItems().add(paymentStr);
		obligationBox.setValue("$" + paymentStr);


		
	}
	
	@FXML
	private void maxPay(){
		if(this.getHousingPayment() < this.getHousingObligationPayment()){
					
			String junk = Float.toString(this.getHousingPayment());
			maxPayBox.getItems().clear();
			maxPayBox.getItems().add(junk);
			maxPayBox.setValue("$" + junk);
			
		}
		else{
			String junk = Float.toString(this.getHousingObligationPayment());
			maxPayBox.getItems().clear();
			maxPayBox.getItems().add(junk);
			maxPayBox.setValue("$" + junk);
			
		}
		
	}
	
	@FXML
	private void mortgageFinanced(){
		
		if(this.getHousingPayment() < this.getHousingObligationPayment()){
			float term = (float) termBox.getValue();
			term = (float) (term * 12.0);
			float pmt = this.getHousingPayment();
			float rate = (float) (.06 / 12.0);		
			float denom = (float) Math.pow((1+rate), term*-1);
			float num = (float) rate / (1 - denom);
			float maxAmt = (float) ((pmt / num) - getDownPayment());			
			String junk = Float.toString(maxAmt);
			mortgageBox.getItems().clear();
			mortgageBox.getItems().add(junk);
			mortgageBox.setValue("$" + junk);
			
					
			
			
		}
		else{
			float term = (float) termBox.getValue();
			term = (float) (term * 12.0);
			float pmt = this.getHousingObligationPayment();
			float rate = (float) (.06 / 12.0);		
			float denom = (float) Math.pow((1+rate), term*-1);
			float num = (float) rate / (1 - denom);
			float maxAmt = (float) ((pmt / num) - getDownPayment());
			
			
			
			String junk = Float.toString(maxAmt);
			mortgageBox.getItems().clear();
			mortgageBox.getItems().add(junk);
			mortgageBox.setValue("$" + junk);
			
		}
		
	}
	
	

	public float getHousingPayment() {
		return housingPayment;
	}

	public void setHousingPayment(float housingPayment) {
		this.housingPayment = housingPayment;
	}
	
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) 
	        	return false;
	    }
	    return true;
	}
	
	
	
	
	

}
