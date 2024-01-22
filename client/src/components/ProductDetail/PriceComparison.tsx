import styles from "./PriceComparison.module.scss";
import downArrow from "assets/icons/expand_more.svg";

const PriceComparison = () => {
  return (
    <div className={styles.layout}>
      <div className={styles.title}>
        가격비교
        <img src={downArrow} />
      </div>
      <table>
        <thead>
          <tr>
            <th>브랜드</th>
            <th>가격</th>
            <th>배송비</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>아이허브</td>
            <td>45000</td>
            <td>무료배송</td>
          </tr>
          <tr>
            <td>아이허브</td>
            <td>45000</td>
            <td>무료배송</td>
          </tr>
          <tr>
            <td>아이허브</td>
            <td>45000</td>
            <td>무료배송</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default PriceComparison;
