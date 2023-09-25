// declare module "*.module.scss" {
//   const content: { [className: string]: string };
//   export = content;
// }

declare module "*.module.scss" {
  const content: { [className: string]: string };
  export default content;
}
