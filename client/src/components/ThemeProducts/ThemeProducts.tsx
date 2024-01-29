import styles from "./ThemeProducts.module.scss";
import ProductItem from "components/ProductItem/ProductItem";
import { propsProductItem } from "../ProductItem/ProductItem";
import { useEffect } from "react";
import productsApi from "../../services/apis/products";

// TODO:https://github.com/typicode/json-server#simple-example
const products = [
  {
    name: "Life Extension, 투 퍼 데이 종합비타민, 캡슐 120정",
    alt: "상품",
    imgURL:
      "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/lex/lex14591/v/180.jpg",
  },
  {
    name: "Life Extension, 투 퍼 데이 종합비타민, 캡슐 120정",
    alt: "상품",
    imgURL:
      "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/lex/lex14591/v/180.jpg",
  },
  {
    name: "Life Extension, 투 퍼 데이 종합비타민, 캡슐 120정",
    alt: "상품",
    imgURL:
      "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/lex/lex14591/v/180.jpg",
  },
  {
    name: "Life Extension, 투 퍼 데이 종합비타민, 캡슐 120정",
    alt: "상품",
    imgURL:
      "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/lex/lex14591/v/180.jpg",
  },
  {
    name: "Life Extension, 투 퍼 데이 종합비타민, 캡슐 120정",
    alt: "상품",
    imgURL:
      "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/lex/lex14591/v/180.jpg",
  },
];

interface propsThemProducts {
  title: string;
  type?: "highlight" | null;
  description: string;
}

const getData = async () => {
  const responseData = await productsApi.getWeeklyPopular(5);
  return responseData;
};

const ThemeProducts = ({
  title,
  type = null,
  description,
}: propsThemProducts) => {
  return (
    <div className={styles.layout}>
      <div className={styles.titleLayout}>
        <span
          className={`${type === "highlight" ? styles.titleHighlight : ""} ${
            styles.title
          }`}
        >
          {title}
        </span>
        <span className={styles.description}>{description}</span>
      </div>
      <hr className={styles.bar} />
      <div className={styles.productItems}>
        {products.map((item, idx) => {
          return (
            <ProductItem
              key={idx}
              name={item.name}
              alt={item.alt}
              imgURL={item.imgURL}
            />
          );
        })}
      </div>
    </div>
  );
};

export default ThemeProducts;
