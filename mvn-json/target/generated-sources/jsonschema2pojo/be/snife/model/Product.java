
package be.snife.model;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Product
 * <p>
 * A product from Acme's catalog
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "productName",
    "price",
    "tags"
})
@Generated("jsonschema2pojo")
public class Product {

    /**
     * The unique identifier for a product
     * (Required)
     * 
     */
    @JsonProperty("productId")
    @JsonPropertyDescription("The unique identifier for a product")
    private Integer productId;
    /**
     * Name of the product
     * (Required)
     * 
     */
    @JsonProperty("productName")
    @JsonPropertyDescription("Name of the product")
    private String productName;
    /**
     * The price of the product
     * (Required)
     * 
     */
    @JsonProperty("price")
    @JsonPropertyDescription("The price of the product")
    private Double price;
    /**
     * Tags for the product
     * 
     */
    @JsonProperty("tags")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Tags for the product")
    private Set<String> tags = new LinkedHashSet<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The unique identifier for a product
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    /**
     * The unique identifier for a product
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Name of the product
     * (Required)
     * 
     */
    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    /**
     * Name of the product
     * (Required)
     * 
     */
    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * The price of the product
     * (Required)
     * 
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * The price of the product
     * (Required)
     * 
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Tags for the product
     * 
     */
    @JsonProperty("tags")
    public Set<String> getTags() {
        return tags;
    }

    /**
     * Tags for the product
     * 
     */
    @JsonProperty("tags")
    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productId");
        sb.append('=');
        sb.append(((this.productId == null)?"<null>":this.productId));
        sb.append(',');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.productId == rhs.productId)||((this.productId!= null)&&this.productId.equals(rhs.productId))))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
