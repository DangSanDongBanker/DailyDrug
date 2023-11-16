import styles from "./ProductDetailInfo.module.scss";

const stringToUl = (str: string) => {
  const lines = str.split("\n");
  return (
    <ul>
      {lines.map((line, idx) => (
        <li id={`${idx}`}>{line}</li>
      ))}
    </ul>
  );
};

const ProductDetailInfo = () => {
  const category = "카테고리 > 영양제 > 유산균";
  const imgURL =
    "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/cgn/cgn00965/r/68.jpg";
  const productName =
    "California Gold Nutrition, LactoBif 프로바이오틱스, 300억 CFU, 베지 캡슐 60정";
  const productDescription = `California Gold Nutrition MATCHA ROAD 말차 + 비타민C, 시트러스 진저 향
	카무카무, 생강, 강황, 유기농 오렌지 껍질을 함유한 슈퍼 푸드 드링크 믹스
	시트러스 진저 향 말차 분말 10팩
	유기농 일본 말차 녹차 함유
	채식주의자와 비건에게 적합
	글루텐, 유전자 변형 성분, 대두 무함유
	cGMP 인증 시설에서 제조`;

  return (
    <>
      <div className={styles.layout}>
        <div className={styles.productTitle}>
          <div className={styles.category}>{category}</div>
          <div className={styles.productName}>{productName}</div>
        </div>
        <div className={styles.productInfo}>
          <div className={styles.productImgLayout}>
            <img src={imgURL} alt={productName} />
          </div>
          <div className={styles.productDescription}>
            <div className={styles.descriptionTitle}>상품설명</div>
            <div className={styles.productDescriptionList}>
              {stringToUl(productDescription)}
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default ProductDetailInfo;
