import styles from "./Spinner.module.scss";

const Spinner = () => {
  return (
    <div className={styles.layout}>
      <span className={styles.loader}></span>
    </div>
  );
};

export default Spinner;
