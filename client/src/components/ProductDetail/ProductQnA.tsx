import styles from "./ProductQnA.module.scss";
import userIcon from "assets/icons/user.svg";
import replyIcon from "assets/icons/reply.svg";

const ProductQnA = () => {
  const id = "greeny135";
  const contents =
    "설탕이 많이 들어 있지 않아 좋습니다. 살짝 탄산 맛이 나는데 제가 생각했던 마차 맛은 아니라 당황했지만 상큼한 걸 좋아하신다면 추천드립니다. 차갑게 해서 드시는게 맛에 좋고 마차가 잠을 깨우는 효과가 있어 커피 카페인 대용으로도 훌륭합니다.";
  const reply =
    "좋은 내용이네요. 하지만 품질과 성분은 좋아요 다만 싸한 맛은 잘 적응이 안돼지만 먹기에는 그리 나쁘지 않습니다 차 대용으로 좋아요";
  const date = new Date();
  return (
    <div className={styles.layout}>
      <div className={styles.profileImg}>
        <img src={userIcon} alt="user icon" />
      </div>
      <div className={styles.date}>{date.toISOString()}</div>
      <div className={styles.contents}>
        <div className={styles.id}>{id}</div>
        <div className={styles.question}>{contents}</div>
        <div className={styles.answer}>
          <img src={replyIcon} alt="" />
          관리자 : {reply}
        </div>
      </div>
    </div>
  );
};

export default ProductQnA;
