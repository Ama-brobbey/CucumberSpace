Feature: Products

Scenario Outline: Validate promo code alert is visible when clicking on the special offers link

	Given user navigates to "<url>" website 
	When user clicks on the "<button>"
	Then user should be presented with a promo alert
	
	
	Examples:
	|                           url                                    |    button           |
	|https://webdriveruniversity.com/Page-Object-Model/products.html | container-special-offers |
	
	