import styles from "./ProductDetailPage.module.scss";
import PriceComparison from "components/ProductDetail/PriceComparison";
import ProductDetailInfo from "components/ProductDetail/ProductDetailInfo";
import ProductQnA from "components/ProductDetail/ProductQnA";
import expandMoreArrow from "assets/icons/expand_more.svg";

const ProductDetailPage = () => {
  const category = "카테고리 > 영양제 > 유산균";
  const productName =
    "California Gold Nutrition, LactoBif 프로바이오틱스, 300억 CFU, 베지 캡슐 60정";
  return (
    <div className={styles.layout}>
      <div className={styles.productTitle}>
        <div className={styles.category}>{category}</div>
        <div className={styles.productName}>{productName}</div>
      </div>
      <div className={styles.productArea}>
        <div className={styles.productDetailArea}>
          <ProductDetailInfo />
        </div>
        <div className={styles.productRightArea}>
          <PriceComparison />
          <div className={styles.buttons}>
            <button>관심있는 약 등록</button>
            <button>복용중인 영양제</button>
          </div>
        </div>
      </div>
      <div className={styles.qnaArea}>
        <div className={styles.qnaTitle}>
          문의 하기
          <img src={expandMoreArrow} alt="down arrow" />
        </div>
        <div className={styles.qnaList}>
          <ProductQnA />
        </div>
      </div>
    </div>
  );
};

export default ProductDetailPage;
