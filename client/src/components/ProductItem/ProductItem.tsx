import styles from "./ProductItem.module.scss";

export interface propsProductItem {
  name: string;
  alt: string;
  imgURL: string;
}

// const product = {
//   name: "Life Extension, 투 퍼 데이 종합비타민, 캡슐 120정",
//   alt: "상품",
//   imgURL:
//     "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/lex/lex14591/v/180.jpg",
// };
const ProductItem = (props: propsProductItem) => {
  const product = {
    name: props.name,
    alt: props.alt,
    imgURL: props.imgURL,
  };

  const clickkHandleLikeBtn = () => {
    console.log("좋아요❤️");
  };

  const clickHandleProduct = () => {
    console.log("상품 상세로 이동하기");
  };

  return (
    <div className={styles.layout}>
      <div className={styles.image}>
        <img src={product.imgURL} alt={product.alt} />
      </div>
      <button onClick={clickkHandleLikeBtn} className={styles.likeBtn}>
        💛
      </button>
      <div onClick={clickHandleProduct} className={styles.name}>
        {product.name}
      </div>
    </div>
  );
};

export default ProductItem;
