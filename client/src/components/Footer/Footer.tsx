import styles from "./Footer.module.scss";

const Footer = () => {
  return (
    <div className={styles.layout}>
      <div className={styles.footer}>
        <div className={styles.company}>
          © 2023 Project DangSanDongBanker Corp.
        </div>

        <div className={styles.info}>
          <span>서울특별시 영등포구 당산제2동 당산로 219 (주)당산동물주</span>
          <span>사업자등록번호 : 2023-11-0904</span>
          <span>대표 : 전병천, 정명진</span>
        </div>

        <div className={styles.policy}>이용약관 | 개인정보 처리방침</div>
      </div>
    </div>
  );
};

export default Footer;
